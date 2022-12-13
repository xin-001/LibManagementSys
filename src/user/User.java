package user;

import book.BookList;
import operation.IOperation;

/*User class: This class is the parent class of the other two classes in the user package.
This class is used to determine the user type and implement it.
 */
public abstract class User {

    //Two variables: save your name and create an array of IOperations for corresponding operations
    protected String name;
    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    //Print the corresponding menu by user type
    public abstract int menu();

    //Select the operation you want to perform
    public void doOperation(int choice, BookList bookList) {
        this.operations[choice].work(bookList);
    }
}
