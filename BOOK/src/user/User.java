package user;

import book.BookList;
import operation.IOperation;

import java.util.Scanner;

public abstract class User {
    protected String name;
    protected IOperation[] operations;
    Scanner scaner = new Scanner(System.in);
    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
