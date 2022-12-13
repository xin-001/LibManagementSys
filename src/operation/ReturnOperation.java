package operation;

import book.BookList;
import book.Book;
import java.util.Scanner;

public class ReturnOperation implements IOperation{

    //override work method
    @Override
    public void work(BookList bookList) {
        System.out.println("Return books！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the book thar you want return：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
//修改图书状态，是否被借出
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("Return successful！");
                return;
            }
        }
    }
}
