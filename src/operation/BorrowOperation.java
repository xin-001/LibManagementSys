package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    //Override work method
    @Override
    public void work(BookList bookList) {
        Scanner sc=new Scanner(System.in);

//view the information of all books.
        System.out.println("view the information of all books：");
        for (int i=0;i< bookList.getUsedSize();i++)
        {
            Book book=bookList.getBook(i);
            System.out.println(book);
        }
        System.out.println("Which book you want to borrow：");
        String name = sc.nextLine();

// Check the book is available or not
        for (int i=0;i< bookList.getUsedSize();i++)
        {
            Book book=bookList.getBook(i);
            if (book.getName().equals(name))
            {
                System.out.println("This book is available！");
                if(!book.isBorrowed())
                {
                    System.out.println("The book is available，Book borrowing succeeded！");
                    book.setBorrowed(true);
                    System.out.println(book);
                    break;
                }
            }
            if (i== bookList.getUsedSize()-1)
                System.out.println("The book is not available，！Failed to borrow this book");
        }
    }
}
