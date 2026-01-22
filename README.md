# Observer Design Pattern (Namoyish)

## Kirish

Ushbu loyiha **Observer (Kuzatuvchi) dizayn namunasi** qanday ishlashini amaliy misol orqali ko‘rsatish uchun yozilgan. Observer pattern obyektlar o‘rtasida **birga bog‘lanmagan (loose coupling)** aloqani ta’minlaydi va bir obyekt holati o‘zgarganda, unga bog‘langan boshqa obyektlar avtomatik xabardor qilinishini ta’minlaydi.

Bu misolda biz **YouTube kanal – obunachi** (channel–subscriber) ssenariysini modellashtirdik.

---

## Pattern ishtirokchilari

### 1. Subject (Publisher)

`Subject` interfeysi kuzatuvchilarni boshqarish uchun umumiy shartnomani belgilaydi.

Mas’uliyatlari:

* Kuzatuvchini qo‘shish (`subscribe`)
* Kuzatuvchini olib tashlash (`unsubscribe`)
* Kuzatuvchilarga xabar berish (`notifyVideo`)

Bu loyihada:

* `Subject` — interfeys
* `Channel` — Subject’ning aniq (concrete) implementatsiyasi

---

### 2. Observer (Subscriber)

`Observer` interfeysi xabar qabul qiluvchi obyektlar uchun umumiy kontraktni belgilaydi.

Mas’uliyatlari:

* Subject’dan kelgan yangilanishni qabul qilish (`update`)

Bu loyihada:

* `Observer` — interfeys
* `User` — Observer’ning aniq implementatsiyasi

---

## Sinflar tavsifi

### Channel

* `Observer` obyektlar ro‘yxatini saqlaydi
* Yangi video yuklanganda barcha obunachilarga xabar beradi

```java
Channel designPatterns = new Channel("DESIGN-PATTERNS");
```

---

### User

* Kanalga obuna bo‘ladi
* Yangi video chiqqanda xabar oladi

```java
Observer user1 = new User("Vokhid");
```

---

### Client

`Client` klassi Observer pattern’ning ishlashini namoyish qiladi:

* Foydalanuvchilarni kanalga obuna qiladi
* Video yuklaydi
* Obunani bekor qiladi

```java
designPatterns.subscribe(user1);
designPatterns.uploadVideo("Observer-design-pattern!");
```

---

## Ishlash jarayoni (Flow)

1. `Channel` yaratiladi
2. `User` obyektlari kanalga obuna bo‘ladi
3. Kanal yangi video yuklaydi
4. Barcha obunachilar `update()` orqali xabardor qilinadi
5. Obunachi olib tashlanganda, u endi xabar olmaydi

---

## Nima uchun Observer Pattern?

* Obyektlar o‘rtasida qattiq bog‘liqlik bo‘lmaydi
* Yangi kuzatuvchilarni qo‘shish oson
* Ochiq/yopiq prinsipi (Open/Closed Principle)ga mos

---

## Xulosa

Ushbu loyiha Observer dizayn namunasining asosiy g‘oyasini sodda va tushunarli shaklda ko‘rsatadi. Real hayotdagi **obuna–xabarnoma** tizimlari (YouTube, Telegram, Notification system) aynan shu pattern asosida quriladi.

---

