package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    //Override work method
    @Override
    public void work(BookList bookList) {
        System.out.println("Delete Book！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the book that you want to delete：");
        String name = scanner.nextLine();
        int j=0;
        for (int i=0;i< bookList.getUsedSize();i++)
        {
            Book book=bookList.getBook(i);
            if (book.getName().equals(name))
            {
                j=i;
                break;
            }
        }

//Renumber books
        for (int i=j;i< bookList.getUsedSize()-1;i++)
        {
            Book book=bookList.getBook(i+1);
            bookList.setBooks(i,book);
        }

//Change the total number of books
        int currentSize=bookList.getUsedSize();
        bookList.setUsedSize(currentSize-1);
        System.out.println("Delete successful！");
    }
}
