package operation;

import book.BookList;

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
    }
}