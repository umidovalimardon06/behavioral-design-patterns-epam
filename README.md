# Memento Design Pattern – TextDocument misoli

## Kirish

Ushbu loyiha **Memento (Momento)** design pattern’ning sodda va tushunarli implementatsiyasini ko‘rsatadi. Misol sifatida oddiy **matnli hujjat (TextDocument)** va undagi **Undo (orqaga qaytish)** funksionalligi tanlangan.

Maqsad — obyektning ichki holatini (state) tashqi dunyoga ochmasdan saqlash va keyinchalik tiklash imkonini berish.

---

## Muammo (Problem Statement)

Dasturda ko‘pincha quyidagi ehtiyoj paydo bo‘ladi:

* Obyekt holatini vaqtincha saqlash
* Keyinchalik avvalgi holatga qaytish (Undo)

Ammo agar:

* Obyektning ichki holatini tashqariga ochsak
* Yoki boshqa obyektlar uni bevosita o‘zgartira olsa

bu **encapsulation buzilishiga** va **chaotic state** muammosiga olib keladi.

---

## Memento Pattern yechimi

**Memento pattern** quyidagi prinsipga asoslanadi:

> Obyekt o‘zining ichki holatini maxsus obyekt (Memento) ichida saqlaydi va tashqi obyektlar bu holatning tafsilotlarini bilmaydi.

Bu pattern 3 ta asosiy rolga ega:

1. **Originator** – holati saqlanadigan obyekt (`TextDocument`)
2. **Memento** – holatni saqlovchi obyekt (`Momento`)
3. **Caretaker** – Memento’dan foydalanib boshqaruvchi qism (`DocumentClient`)

---

## Klasslar tavsifi

### 1. TextDocument (Originator)

`TextDocument` — asosiy biznes obyekt.

Mas’uliyatlari:

* Matnni yozish (`write`)
* Matnni chiqarish (`print`)
* Joriy holatni saqlash (`save`)
* Oldingi holatga qaytish (`undo`)

Muhim jihat:

* `text` maydoni **private**
* Holat faqat `Momento` orqali saqlanadi

---

### 2. Momento (Memento)

`Momento` — obyekt holatining snapshot’i.

Mas’uliyati:

* `TextDocument` ning ichki holatini (`state`) saqlash

Xususiyatlari:

* Juda sodda klass
* Biznes mantiqqa ega emas
* Faqat holatni saqlash va qaytarish bilan shug‘ullanadi

---

### 3. DocumentClient (Caretaker)

`DocumentClient` — foydalanuvchi tomoni.

Mas’uliyati:

* `TextDocument` bilan ishlash
* Qachon `save()` yoki `undo()` chaqirilishini belgilash

Muhim:

* `Momento` ning ichki tuzilishini **bilmaydi**
* Faqat yuqori darajadagi API’dan foydalanadi

---

## Ishlash ketma-ketligi

Dastur quyidagi tartibda ishlaydi:

1. Foydalanuvchi matn yozadi: `"Hi"`
2. Matn saqlanadi (`save()`)
3. Yana matn qo‘shiladi: `" world!"`
4. `undo()` chaqiriladi
5. Hujjat saqlangan holatga qaytadi

Natija:

```
Hi
Hi world!
Hi
```

---

## Afzalliklar

Ushbu implementatsiya:

* Encapsulation’ni buzmaydi
* Holatni xavfsiz saqlaydi
* Undo funksiyasini sodda qiladi
* Kodni tushunarli va testga qulay qiladi

---

## Cheklovlar (Limitations)

Joriy implementatsiya:

* Faqat **bitta holatni** saqlaydi
* Ko‘p darajali undo (history stack) yo‘q

Amaliy tizimlarda odatda:

* `List<Momento>` yoki `Stack<Momento>` ishlatiladi

---

## Xulosa

Bu misol **Memento design pattern** ning asosiy g‘oyasini aniq ko‘rsatadi:

> Obyekt o‘z holatini eslab qoladi, lekin bu xotira tashqi dunyo uchun yopiq bo‘ladi.

Pattern ayniqsa:

* Text editor
* Configuration rollback
* Game save/load

kabi holatlarda juda foydali.

---

> Ushbu README ta’limiy maqsadda yozilgan. Keyingi bosqichda multi-level undo bilan kengaytirilgan versiya ko‘rib chiqilishi mumkin.
