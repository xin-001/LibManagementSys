package operation;

import book.BookList;
import book.Book;

import java.util.Scanner;

public class AddOperation implements IOperation{
    //Override the work method to add the book information
    @Override
    public void work(BookList bookList) {
        System.out.println("Add new books！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the book：");
        String name = scanner.nextLine();
        System.out.println("Please enter the author of the book:");
        String author = scanner.nextLine();
        System.out.println("Please enter the type of book:");
        String type = scanner.nextLine();
        System.out.println("Please enter the price of the book:");
        int price = scanner.nextInt();

//Add A new Book object to save the information of newly added books
        Book book = new Book(name,author,price,type);

//Reset the value of the number of books on the shelf
        int currentSize = bookList.getUsedSize();

        bookList.setBooks(currentSize,book);

        bookList.setUsedSize(currentSize+1);

        System.out.println("Successfully added a book！");
    }
}
