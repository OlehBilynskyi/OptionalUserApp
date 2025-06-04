package app;

//Створюємо клас, який представляє користувача
public class User {
    //Поле id для унікального ідентифікатора користувача
    private int id;
    //Поле name для зберігання імені користувача
    private String name;
    //Поле email для зберігання електронної пошти
    private String email;

    //Конструктор для ініціалізації полів користувача
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Перевизначений метод toString для зручного виведення інформації про користувача
    @Override
    public String toString() {
//Повертаємо рядок у даному форматі
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}