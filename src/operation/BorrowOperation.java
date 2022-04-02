package operation;

import book.Book;
import book.BookList;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList){

        System.out.println("借阅图书！");
        System.out.println("请输入你要借阅的图书名称：");
        String name = sc.nextLine();
        int size = bookList.getUesdSize();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有找到该书籍！");
    }
}
