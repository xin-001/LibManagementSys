package user;

import operation.*;

import java.util.Scanner;

public class AdminUsers extends User {

    //AdminUsers Construction method
    public AdminUsers(String name) {
        super(name);
        this.operations =new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }

    //Design the menu of administrator users, and to realize their functions
    public int menu(){
        System.out.println("hello "+this.name+"Welcome to the library！");
        System.out.println("1,Research books！");
        System.out.println("2,Add a new book！");
        System.out.println("3,Delete the book！");
        System.out.println("4,Book list！");
        System.out.println("0,Exit System！");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}
