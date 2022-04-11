package ru.home.tests;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book(1, "Детство",
                new Author[]{new Author("Лев","Николаевич", "Толстой")},
                "Лабиринт", 2018, 233, 243, "Твердый");
        bookList.add(book1);
        Book book2 = new Book(2, "Война и мир",
                new Author[]{new Author("Лев","Николаевич", "Толстой")},
                "Эксмо", 2021, 1035, 892, "Твердый");
        bookList.add(book2);
        Book book3 = new Book(3, "Анна Каренина",
                new Author[]{new Author("Лев","Николаевич", "Толстой")},
                "Эксмо", 2020, 563, 392, "Твердый");
        bookList.add(book3);
        Book book4 = new Book(4, "Преступление и наказание",
                new Author[]{new Author("Федор","Михайлович", "Достоевский")},
                "Лабиринт", 2013, 472, 392, "Твердый");
        bookList.add(book4);
        Book book5 = new Book(5, "Идиот",
                new Author[]{new Author("Федор","Михайлович", "Достоевский")},
                "Эксмо", 2019, 322, 292, "Твердый");
        bookList.add(book5);
        Book book6 = new Book(6, "Братья Карамазовы",
                new Author[]{new Author("Федор","Михайлович", "Достоевский")},
                "Эксмо", 2021, 532, 583, "Твердый");
        bookList.add(book6);

        Book book7 = new Book(7, "Двенадцать стульев",
                new Author[]{new Author("Илья","Игоревич", "Ильф"),
                        new Author("Евгений", "Сергеевич","Петров")},
                "Эксмо", 2021, 532, 583, "Твердый");
        bookList.add(book7);

        String requestedAuthor = "Достоевский";
        String requestedPublishHouse = "Эксмо";
        int requestedPublishYear = 2020;

        System.out.println("Все книги автора: " + requestedAuthor);
        for (Book b: bookList)
        {
            if (b.getAuthors()[0].getSecondName().equals(requestedAuthor)) {
                System.out.println(b);
            }
        }


        System.out.println("Все книги издательства: " + requestedPublishHouse);
        for (Book b: bookList)
        {
            if (b.getPublishHouse().equals(requestedPublishHouse)) {
                System.out.println(b);
            }
        }

        System.out.println("Все книги выпущенные ранее: " + requestedPublishYear + " года");
        for (Book b: bookList)
        {
            if (b.getPublishYear() > requestedPublishYear) {
                System.out.println(b);
            }
        }
    }
}
