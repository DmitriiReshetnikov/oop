package ru.home.tests;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class Book {
    private final int bookId;
    private final String title;
    private final Author[] authors;
    private final String publishHouse;
    private final int publishYear;
    private final int pages;
    private final int price;
    private final String bindingType;

    @Override
    public String toString() {
        String authorsNames;
        if (authors == null) {
            authorsNames = "";
        } else {
            authorsNames = Arrays.stream(authors)
                    .filter(Objects::nonNull)
                    .map(it -> it.getSecondName() +
                            " " + it.getFirstName().charAt(0) +
                            "." + it.getLastName().charAt(0) + ". ").collect(Collectors.joining());
        }
//        ArrayList<String> authorsString = new ArrayList<>();
//        for (int i = 0; i < authors.length; i++) {
//            String lastNameChar = "";
//            if (authors[i].getLastName() != null) {
//                lastNameChar = authors[i].getLastName().charAt(0) + ".";
//            }
//            authorsString.add(authors[i].getSecondName() + " " +
//                    authors[i].getFirstName().charAt(0) + "." + lastNameChar);
//            if (i != (authors.length - 1))
//                authorsString.add(";");
//        }
        return "{ Книга номер = " + bookId + "\n" +
                "Название='" + title + '\'' + "\n" +
                "Автор(ы)=" + authorsNames + "\n" +
                "Издательство='" + publishHouse + '\'' + "\n" +
                "Год издания=" + publishYear + "\n" +
                "Число страниц=" + pages + "\n" +
                "Цена=" + price + "\n" +
                "Переплет='" + bindingType + '\'' +
                '}' + "\n";
    }
}
