import book.BookList;
import user.AdminUsers;
import user.NormalUsers;
import user.User;

import java.util.Scanner;

public class Main {

    //Check which type of the User you are
    public static User login(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter your name：");
        String name =sc.nextLine();

        System.out.println("Please confirm your identity：1-》AdminUsers，0-》NormalUsers");
        int choice=sc.nextInt();

        if (choice==1)
            return new AdminUsers(name);
        else
            return new NormalUsers(name);

    }

    public static void main(String[] args) {
        BookList bookList=new BookList();

        User user=login();

//Implement what you want to do
        while (true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
}