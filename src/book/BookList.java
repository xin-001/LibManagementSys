package book;

/*BookList class: a bookshelf, which initially stores three books,
and can be added, deleted, and searched.*/
public class BookList {

    private Book[] books =new Book[10];//Create a book group of Book class to put books

    private int usedSize;//Record how many books there are.

    //The construction method of BookList to store all book contents
    public BookList(){
        books[0] = new Book("Solito","Javier Zamora",25,"Novel");
        books[1] = new Book("Mad Honey","Jodi Picoult",14,"Novel");
        books[2] = new Book("The Overnight Guest","Heather Gudenkauf ",13,"Novel");
        usedSize = 3;
    }

    /**
     *
     * @param pos pos位置一定是合法的
     * @return a book
     */
    public Book getBook(int pos) {
        return books[pos];
    }

    /**
     *
     * @param pos pos位置一定是合法的
     * @param book The book you want
     */
    public void setBooks(int pos,Book book) {
        books[pos] = book;
    }

    /**
     * Get the current number of books
     * @return
     */
    public int getUsedSize() {
        return usedSize;
    }

    /**
     * Modify the number of books on the current shelf
     */
    public void setUsedSize(int size) {
        usedSize = size;
    }

}
