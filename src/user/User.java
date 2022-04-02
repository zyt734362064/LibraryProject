package user;

import book.BookList;
import operation.IOperation;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public abstract class User {
    protected String name;

    protected IOperation[] iOperations;
    public User(String name){

        this.name = name;
    }


    public  abstract int meau();

    public void doWork(int choice, BookList bookList){
        iOperations[choice].work(bookList);
    }
}
