// Singleton Pattern: LibrarySystem class
public class LibrarySystem {
    private static LibrarySystem instance;

    // Private constructor to prevent instantiation
    private LibrarySystem() {}

    // Public method to provide the single instance of the library system
    public static LibrarySystem getInstance() {
        if (instance == null) {
            instance = new LibrarySystem();
        }
        return instance;
    }

    // Main functionality of the library system
    public void startLibrary() {
        // Factory Pattern usage to create members
        Member student = MemberFactory.createMember("student", "Alice");
        Member faculty = MemberFactory.createMember("faculty", "Dr. Smith");

        Book book1 = new Book("Design Patterns", "Erich Gamma", "123456");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "654321");

        student.borrowBook(book1);  // Alice borrows a book
        faculty.borrowBook(book2);  // Dr. Smith borrows a book

        student.returnBook(book1);  // Alice returns the book
        faculty.returnBook(book2);  // Dr. Smith returns the book
    }

    public static void main(String[] args) {
        LibrarySystem library = LibrarySystem.getInstance();
        library.startLibrary();
    }
}
