# State Design Pattern – Demonstratsiya

## Maqsad

Ushbu loyiha **State (Holat)** behavioral design pattern’ini oddiy va tushunarli misol orqali ko‘rsatish uchun yaratilgan. Misolda hujjat (Document) hayot sikli turli holatlar (state) orqali boshqariladi.

---

## Muammo

Agar obyektning xatti-harakati (behavior) uning ichki holatiga bog‘liq bo‘lsa va biz bu holatni `if / else` yoki `switch` orqali boshqarsak:

* Kod murakkablashadi
* Yangi holat qo‘shish qiyinlashadi
* Ochiq–yopiq prinsipi (Open–Closed Principle) buziladi
* Xatolar ehtimoli oshadi

**State design pattern** aynan shu muammoni hal qilish uchun ishlatiladi.

---

## G‘oya (Asosiy Konsepsiya)

State pattern’ning asosiy g‘oyasi:

> Obyektning xatti-harakatini uning ichki holatiga qarab o‘zgartirish va har bir holatni alohida klass sifatida modellashtirish.

Ya’ni:

* Holat (state) → alohida obyekt
* Har bir holat → o‘ziga xos behavior
* Context (asosiy obyekt) → faqat delegatsiya qiladi

---

## Misol: Document Workflow

### Holatlar (States)

* **DRAFT** – hujjat tahrir qilinadi
* **REVIEW** – tahrir taqiqlangan
* **PUBLISHED** – tahrir va qayta nashr qilish mumkin emas

Har bir holat `DocumentState` interfeysini implement qiladi.

---

## Strukturasi

* `DocumentState` – State interfeys
* `DraftState` – Boshlang‘ich holat
* `ReviewState` – Tekshiruv holati
* `PublishedState` – Yakuniy holat
* `DocumentContext` – Context (holatni saqlovchi obyekt)
* `Main` – ishga tushirish va namoyish

---

## Nima Yutildi?

State pattern qo‘llanilishi natijasida:

* `if / else` va `switch` lar yo‘qoldi
* Har bir holatning qoidalari bitta joyda jamlandi
* Yangi holat qo‘shish osonlashdi
* Kod o‘qilishi va testlanishi yaxshilandi

Masalan, yangi `ARCHIVED` holatini qo‘shish uchun:

* Faqat yangi klass yoziladi
* Mavjud kod deyarli o‘zgarmaydi

---

## Qachon State Pattern Ishlatiladi?

Quyidagi holatlarda State pattern juda foydali:

* Obyektning xatti-harakati holatga bog‘liq bo‘lsa
* Holatlar soni ortib borishi kutilsa
* `if / else` lar haddan tashqari ko‘payib ketgan bo‘lsa

---

## Xulosa

**State design pattern** – bu obyekt holatiga bog‘liq bo‘lgan murakkab behavior’larni toza, kengaytiriladigan va professional tarzda boshqarish usulidir.

U real backend tizimlarda (order status, payment flow, workflow, session lifecycle) juda keng qo‘llaniladi.

---

