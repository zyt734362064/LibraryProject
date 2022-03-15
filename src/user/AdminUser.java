package user;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class AdminUser extends User {
    public AdminUser(String name){
        super(name);
    }

    public void meau(){
        System.out.println("===========管理员菜单==========");
        System.out.println("Hello" + this.name + ",欢迎您的到来!");
        System.out.println("1.查找图书！");
        System.out.println("2.新增图书！");
        System.out.println("3.删除图书！");
        System.out.println("4.显示图书！");
        System.out.println("0.退出系统！");
    }
}
