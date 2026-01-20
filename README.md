# ECommerce misolida kuchli bog‘liqlik (Tight Coupling) muammosi

## Kirish

Ushbu loyiha oddiy **E-Commerce** ssenariysini modellashtiradi. Tizimda uchta asosiy ishtirokchi mavjud:

* `Consumer` – mahsulot sotib oluvchi
* `ECommerceSite` – mahsulot sotuvchi platforma
* `Driver` – mahsulotni yetkazib beruvchi

Kod ishlaydi va funksional jihatdan to‘g‘ri, ammo dizayn nuqtai nazaridan **arxitekturaviy muammo** mavjud.

---

## Mavjud dizayn va bog‘liqliklar

Hozirgi kodda obyektlar o‘rtasida quyidagi bog‘liqliklar mavjud:

* `Consumer`:

    * `ECommerceSite` ni **o‘zi yaratadi** (`new ECommerceSite(this)`)
* `ECommerceSite`:

    * `Consumer` obyektini biladi
    * `Driver` ni **to‘g‘ridan-to‘g‘ri yaratadi** (`new Driver()`)

Bu bog‘liqlikni quyidagicha tasvirlash mumkin:

```
Consumer → ECommerceSite → Driver
   ↑           │
   └───────────┘
```

Bu yerda obyektlar bir-biriga juda qattiq bog‘langan.

---

## Asosiy muammo

### 1. Tight Coupling (kuchli bog‘liqlik)

* `Consumer` faqat `ECommerceSite` bilan ishlay oladi
* `ECommerceSite` faqat bitta `Driver` implementatsiyasiga bog‘langan
* Alternativ e-commerce platforma yoki boshqa yetkazib berish usulini qo‘shish qiyin

### 2. Mas’uliyatlar aralashib ketgan

* `Consumer`:

    * xaridor bo‘lish bilan birga tizimni qanday yaratishni ham biladi
* `ECommerceSite`:

    * savdo
    * yetkazib berishni boshqarish

Bu **Single Responsibility Principle** ga zid.

---

## Chaotic Dependency (tartibsiz bog‘liqlik) xavfi

Tizim kengaygan sari:

* yangi `Driver` turlari
* yangi `Consumer` xatti-harakatlari
* qo‘shimcha servislar (Payment, Notification va h.k.)

qo‘shilishi bilan bog‘liqliklar **nazoratdan chiqishi** mumkin.

Natijada:

> Bitta kichik o‘zgarish tizimning boshqa joylarini kutilmagan tarzda buzadi.

Bu holat **chaotic dependency** deb ataladi.

---

## Nega bu Mediator pattern uchun nomzod?

Ushbu muammoning ildizi:

* Obyektlar **bir-biri bilan bevosita muloqot qilmoqda**
* Muloqot markazlashmagan

**Mediator pattern**:

* Obyektlar o‘rtasidagi aloqani bitta markaziy komponentga ko‘chiradi
* `Consumer`, `ECommerceSite`, `Driver` bir-birini bilmaydi
* Faqat mediator bilan ishlaydi

Bu esa:

* bog‘liqlikni kamaytiradi
* tizimni test qilishni osonlashtiradi
* kengaytirishni xavfsiz qiladi

---

## Xulosa

Berilgan kod ishlaydigan bo‘lsa ham:

* kuchli bog‘liqlikka ega
* kengayishga yomon moslashgan
* arxitekturaviy xavf tug‘diradi

Bu holatni **Mediator design pattern** yordamida ancha toza va boshqariladigan dizaynga keltirish mumkin.

---

> Ushbu README muammoni ko‘rsatish uchun yozilgan. Keyingi bosqichda Mediator pattern asosida refaktor qilingan yechim taqdim etilishi mumkin.
