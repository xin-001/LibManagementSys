package operation;

import book.BookList;

public class ExitOperation implements IOperation{

    //Override work method
    public void work(BookList bookList) {
        System.out.println("Exit！");

//Terminate the currently running Java virtual machine. The parameter is used as the status code.
// If it is zero, the program will be terminated
        System.exit(0);
    }
}
