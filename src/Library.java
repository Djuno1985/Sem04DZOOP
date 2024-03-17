import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<LibraryCard<?, ?>, Book<?>> issuedBooks = new HashMap<>();

    public <T, K, V> void addBook(Book<T> book, LibraryCard<K, V> libraryCard) {
        issuedBooks.put(libraryCard, book);
    }

    public void printIssuedBooks() {
        for (Map.Entry<LibraryCard<?, ?>, Book<?>> entry : issuedBooks.entrySet()) {
            LibraryCard<?, ?> libraryCard = entry.getKey();
            Book<?> book = entry.getValue();
            System.out.println("Card Number: " + libraryCard.getCardNumber() + ", Book Title: " + book.getTitle() + ", Book Info: " + libraryCard.getBookInfo());
        }
    }

}
