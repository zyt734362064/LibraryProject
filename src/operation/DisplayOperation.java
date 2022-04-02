package operation;

import book.Book;
import book.BookList;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书列表！");
        int size = bookList.getUesdSize();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}
