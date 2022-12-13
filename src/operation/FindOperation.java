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
            if (book.getName().equals(name))
            {
                System.out.println("Book is available！This book"+((book.isBorrowed())? "available":"Not available"));
                System.out.println(book);
                break;
            }
            if (i== bookList.getUsedSize()-1)
            {
                System.out.println("Can not find this book！");
                break;
            }

        }
    }
}
