package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{

    //Override
    @Override
    public void work(BookList bookList) {
        System.out.println("searches for books！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the book：");
        String name = scanner.nextLine();

//查找图书
        for (int i=0;i< bookList.getUsedSize();i++)
        {
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println("The book is available! Book information:");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Can not find the book!");



    }
}
