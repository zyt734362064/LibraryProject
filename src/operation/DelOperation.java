package operation;

import book.Book;
import book.BookList;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        System.out.println("请输入你要删除的图书：");
        //1、根据书名找到输得位置
        String name = sc.nextLine();
        int size = bookList.getUesdSize();
        int i = 0;
        int index = 0;
        for (; i < size; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){
                   index = i;
                   break;
            }
        }
        if (i >= size){
            System.out.println("没有你要删除的书籍！");
            return;
        }
        for (int j = 0; j < size - 1; j++) {
            Book book = bookList.getPos(j + 1);
            bookList.setBook(j,book);
        }
        bookList.setBook(size,null);
        bookList.setUesdSize(size - 1);
        System.out.println("删除成功！");
    }
}
