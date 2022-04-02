package operation;

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
    }
}
