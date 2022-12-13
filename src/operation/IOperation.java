package operation;

import book.BookList;

//Because each operation class must implement the work abstract method,
// an interface is created to provide the work method
public interface IOperation {
    void work(BookList bookList) ;
}
