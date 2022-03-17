package user;

import operation.*;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:管理员菜单
 * User:Zyt
 * Date:2022-03-15
 */
public class AdminUser extends User {
    public AdminUser(String name){
        super(name);
        this.iOperations = new IOperation[]{
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new ExitOpereation()
        };
    }

    @Override
    public int meau(){
        System.out.println("===========管理员菜单==========");
        System.out.println("Hello，" + this.name + ",欢迎您的到来!");
        System.out.println("1.查找图书！");
        System.out.println("2.新增图书！");
        System.out.println("3.删除图书！");
        System.out.println("4.显示图书！");
        System.out.println("0.退出系统！");
        System.out.println("===============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
