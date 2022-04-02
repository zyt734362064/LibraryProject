import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:程序的入口
 * User:Zyt
 * Date:2022-03-17
 */
public class Main {
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1->管理员；2->普通用户");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        //向上转型
        User user =  login();
        //动态绑定
        while (true){
            //根据choice 调用合适的操作
            int choice = user.meau();
            user.doWork(choice,bookList);
        }

    }
}
