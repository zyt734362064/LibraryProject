package user;

import operation.*;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class NormalUser extends User {
    public NormalUser(String name){
        super(name);
        this.iOperations = new IOperation[]{
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new ExitOpereation()
        };
    }

    @Override
    public int meau(){
        System.out.println("===========普通用户菜单菜单==========");
        System.out.println("Hello，" + this.name + ",欢迎您的到来!");
        System.out.println("1.查找图书！");
        System.out.println("2.借阅图书！");
        System.out.println("3.归还图书！");
        System.out.println("0.退出系统！");
        System.out.println("===============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
