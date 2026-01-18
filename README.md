# Command Design Pattern  – Java

Bu README siz yozgan kod asosida **Command Pattern hujjatlashtiradi.

Maqsad: harakatni (action) alohida obyektga ajratib, `execute()` orqali ishga tushirish.

---

## Siz yozgan kod

### Command interfeysi

```java
public interface ICommand {
    void execute();
}
```

### Concrete Command’lar

```java
public class RaiseOneHandCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("One hands");
    }
}
```

```java
public class RaiseHandsCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("All hands on");
    }
}
```

### Listener’lar (Invoker sifatida)

```java
public class LeftClickListener implements IEventListener {
    @Override
    public void OnEvent() {
        var command = new RaiseOneHandCommand();
        command.execute();
    }
}
```

```java
public class RightClickEventListener implements IEventListener {
    @Override
    public void OnEvent() {
        ICommand command;

        // if
        command = new RaiseOneHandCommand();

        // else
        command = new RaiseHandsCommand();

        command.execute();
    }
}
```

---

## Bu kod Command Pattern’ni qayerda ko‘rsatadi?

1. **Harakat (action) alohida obyektga ajratilgan**

    * `RaiseOneHandCommand` va `RaiseHandsCommand` — bu “command” obyektlar.
    * Har birida bitta umumiy kirish nuqtasi bor: `execute()`.

2. **Invoker (listener) `execute()` ni chaqiradi**

    * `LeftClickListener` ichida ishni to‘g‘ridan-to‘g‘ri qilish o‘rniga command yaratiladi va `execute()` chaqiriladi.

---

## Hali ham qolayotgan muammo (Command Pattern’ning to‘liq foydasi chiqmayotgan joy)

* `RightClickEventListener` ichida **command tanlash** (`if/else`) logikasi bor (siz komment bilan ko‘rsatgansiz).
* Command’ni tanlash/mapping logikasi listener ichida qolsa:

    * yangi command qo‘shilganda listener’ni o‘zgartirishga to‘g‘ri keladi
    * Open/Closed prinsip to‘liq bajarilmaydi

---

## Xulosa

Sizning kodingiz Command Pattern’ning asosiy g‘oyasini ko‘rsatadi:

* **action = obyekt**
* **execute() orqali ishga tushirish**

Keyingi bosqich (ixtiyoriy): command tanlash logikasini listener ichidan chiqarib, bitta joyda (wiring/registry) qilish.
(README’da qo‘shimcha kod qo‘shilmadi — faqat sizning kodingiz va izoh.)
