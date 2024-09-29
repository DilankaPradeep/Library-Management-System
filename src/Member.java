import java.util.ArrayList;

public class Member implements Borrowable {

    private final String name;
    private final int maxBooksAllowed;
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, int maxBooksAllowed) {
        this.name = name;
        this.maxBooksAllowed = maxBooksAllowed;
    }

    public String getName() {
        return name;
    }

    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < maxBooksAllowed && !book.isBorrowed()) {
            borrowedBooks.add(book);
            book.setBorrowed(true);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(name + " cannot borrow more books.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setBorrowed(false);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println("Book not borrowed by " + name);
        }
    }
}
