package app;

import java.util.ArrayList; //для створення об'єкта списку користувачів
import java.util.List; //для використання списків користувачів
import java.util.Optional; //для безпечної роботи з результатами пошуку

//Створюємо клас для управління користувачем
public class UserRepository {
    //Поле users для зберігання списку користувачів
    private List<User> users = new ArrayList<>();

    //Метод для додавання користувача у список
    public void addUser(User user) {
        users.add(user); //додаємо користувача
    }

    //Метод для пошуку користувача за id
    public Optional<User> findUserById(int id) {
//Проходимо по кожному користувачу у списку та перевіряємо чи id збігається, повертаємо перший збіг у вигляді Optional
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }

    //Метод для пошуку користувача за email
    public Optional<User> findUserByEmail(String email) {
        //Фільтруємо користувачів за email, та повертаємо перший збіг у вигляді Optional
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    //Метод для отримання всіх користувачів
    public Optional<List<User>> findAllUsers() {
        //Якщо список пустий - повертаємо Optional.empty(), інакше повертаємо Optional.of(users)

        if (users.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(users);
        }
    }

}