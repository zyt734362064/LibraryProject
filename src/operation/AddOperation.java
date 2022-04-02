package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("新增图书！");
        System.out.println("请输入书籍的名称：");
        String name = sc.nextLine();
        System.out.println("请输入书籍的作者：");
        String author = sc.nextLine();
        System.out.println("请输入书籍的类型：");
        String type = sc.nextLine();
        System.out.println("请输入书籍的价格：");
        int price = sc.nextInt();


        Book book = new Book(name,author,price,type);
        int size = bookList.getUesdSize();
        bookList.setBook(size,book);
        bookList.setUesdSize(size + 1);
        System.out.println("新增图书成功！");
    }
}
