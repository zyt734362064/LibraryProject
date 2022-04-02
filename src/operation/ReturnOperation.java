package operation;

import book.Book;
import book.BookList;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {

        System.out.println("归还图书！");
        System.out.println("请输入你要归还的图书名称：");
        String name = sc.nextLine();
        int size = bookList.getUesdSize();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){
                if (book.isBorrowed()){
                    book.setBorrowed(false);
                    System.out.println("归还成功！");
                    System.out.println(book);
                    return;
                }
                System.out.println("该图书未被借出！");
                return;
            }
        }
        System.out.println("没有找到该书籍！");
    }
}
