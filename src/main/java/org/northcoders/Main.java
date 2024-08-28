package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.locale.Locale;

import static org.northcoders.dao.FakeBooksDAO.getAllBooks;


public class Main {
    public static void main(String[] args) {
//        FakeBooksDAO fakeBooksDAO = new FakeBooksDAO();
//        System.out.println(fakeBooksDAO.getAllBooks());
//        System.out.println(fakeBooksDAO.getAllBooks(3));
//        System.out.println(fakeBooksDAO.getAllBooks(Locale.fr_FR.ordinal()));

        System.out.println(getAllBooks());

    }
}