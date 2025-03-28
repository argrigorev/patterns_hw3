package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new PhysicalProduct("Samsung Galaxy S25", 699, 5, "Samsung"));
        store.addProduct(new DigitalProduct("Электронная книга", 9.99, 4, "E-Books", "store.com/download/ebooks/book1"));
        store.addProduct(new DigitalProduct("Подписка Netflix", 3.99, 5, "Netflix", "store.com/download/subscriptions/netflix"));
        store.addProduct(new PhysicalProduct("Ноутбук", 1200, 5, "Apple"));
        store.addProduct(new PhysicalProduct("Наушники", 199, 4, "Sony"));
        store.addProduct(new DigitalProduct("Музыкальный альбом", 12.99, 5, "The Weekend", "store.com/download/music/albums/the_weekend"));
        store.addProduct(new PhysicalProduct("Часы", 250, 4, "Casio"));
        store.addProduct(new PhysicalProduct("Samsung Tab S8", 850, 5, "Samsung"));

        Cart cart = new Cart();
        List<Order> orders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать все товары");
            System.out.println("2. Добавить товар в корзину");
            System.out.println("3. Удалить товар из корзины");
            System.out.println("4. Просмотреть корзину");
            System.out.println("5. Оформить заказ");
            System.out.println("6. Просмотреть заказы");
            System.out.println("7. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (Product p : store.getAllProducts()) {
                        System.out.println(p.getInfo());
                    }
                    break;
                case 2:
                    System.out.print("Введите название товара: ");
                    String name = scanner.nextLine();
                    for (Product p : store.getAllProducts()) {
                        if (p.getName().equalsIgnoreCase(name)) {
                            cart.addProduct(p);
                            System.out.println("Товар добавлен в корзину.");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Введите название товара для удаления: ");
                    String removeName = scanner.nextLine();
                    cart.removeProduct(removeName);
                    System.out.println("Товар удален из корзины.");
                    break;
                case 4:
                    System.out.println("Товары в корзине:");
                    for (Product p : cart.getProducts()) {
                        System.out.println(p.getInfo());
                    }
                    System.out.println("Общая стоимость: " + cart.getTotalPrice() + "$\n");
                    break;
                case 5:
                    if (cart.isEmpty()) {
                        System.out.println("Нельзя оформить заказ. Корзина пуста.");
                    } else {
                        Order order = new Order(cart.getProducts());
                        orders.add(order);
                        cart.clearCart();
                        System.out.println("Заказ оформлен!");
                        order.showOrderDetails();
                    }
                    break;
                case 6:
                    for (Order o : orders) {
                        o.showOrderDetails();
                    }
                    break;
                case 7:
                    running = false;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        scanner.close();
    }
}