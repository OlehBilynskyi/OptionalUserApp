package app;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//Створюємо репозиторій користувачів
        UserRepository userRepository = new UserRepository();

        //Додаємо кілька користувачів у репозиторій
        userRepository.addUser(new User(1, "Oleh", "oleh@gmail.com"));
        userRepository.addUser(new User(2, "Maksym", "Maksym@gmail.com"));
        userRepository.addUser(new User(3, "Svitlana", "Svitlana@gmail.com"));

//Пошук користувача за id
        int searchId = 2;
        //Викликаємо метод пошуку, та перевіряємо чи є користувач, та виводимо дані у консоль
        Optional<User> userById = userRepository.findUserById(searchId);
        if (userById.isPresent()) {
            System.out.println("Користувача знайдено за id: " + userById.get());
        } else {
            System.out.println("Користувача з id " + searchId + " не знайдено.");
        }

//Пошук користувача за email
        String searchEmail = "Svitlana@gmail.com";
        //Викликаємо метод пошуку, та перевіряємо чи є користувач
        Optional<User> userByEmail = userRepository.findUserByEmail(searchEmail);
        if (userByEmail.isPresent()) {
            System.out.println("Користувача знайдено за email: " + userByEmail.get());
        } else {
            System.out.println("Користувача з email " + searchEmail + " не знайдено.");
        }
//Отримання списку всіх користувачів
        //Викликаємо метод отримання всіх користувачів, та перевіряємо чи список не порожній
        Optional<List<User>> allUsers = userRepository.findAllUsers();
        if (allUsers.isPresent()) {
            System.out.println("Кількість користувачів у списку: " + allUsers.get().size());
            for (User user : allUsers.get()) { //Проходимо по всіх користувачах
                System.out.println(user); //Виводимо користувача
            }
        } else {
            System.out.println("Список користувачів порожній.");
        }
    }
}