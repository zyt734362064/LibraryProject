package operation;

import book.BookList;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public interface IOperation {
    Scanner sc = new Scanner(System.in);
    void work(BookList bookList);
}
