package user;

import operation.*;

import java.util.Scanner;

//extends the User class, so that the User class can meet the needs of two different users
public class NormalUsers extends User {

    //NormalUsers Construction method
    public NormalUsers(String name) {
        super(name);
        this.operations =new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    //Design the menu of administrator users to realize their functions
    public int menu(){
        System.out.println("hello "+this.name+" Welcome to the library！");
        System.out.println("1,Research books！");
        System.out.println("2,Borrow books！");
        System.out.println("3,Return books！");
        System.out.println("0,Exit System！");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }



}
