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
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");
        System.out.println("请输入你要查找的图书名称：");
        String name = sc.nextLine();
        int size = bookList.getUesdSize();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){
                System.out.println("找到了，此书籍信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到此书籍！");
    }
}
