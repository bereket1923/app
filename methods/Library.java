package methods;

public class Library { // Class name corrected to start with an uppercase letter

    private String[] books = new String[10]; // Array with a capacity of 10
    private int count = 0; // Track the number of books added

    // Method to add a Book to the library's collection
    public void addBook(String book) {
        if (count < books.length) {
            books[count++]= book; // Add the Book and increment the count//Book is title &books is POP.array
            System.out.println("Added Book: " + book);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to check if a Book is available in the library
    //In Java, == checks if two references point to the same object,
        //    while equals() checks if two different objects have the same value.
    private boolean isBookAvailable(String book) {
        for (int i = 0; i < count; i++) {
            if (books[i] != null && books[i].equals(book)) {
                return true; // Book is available
            }
        }
        return false; // Book is not available
    }

    // Method to borrow a Book (removes it from the available collection)
    public void borrowBook(String book) {
        if (isBookAvailable(book)) {
            for (int i = 0; i < count; i++) {
                if (books[i].equals(book)) {
                    System.out.println("Borrowed Book: " + book);
                    books[i] = null; // Mark the Book as borrowed
                    break; // Exit the loop after borrowing the Book
                }
            }
        } else {
            System.out.println("Book not available: " + book);
        }
    }

    // Method to display the available books in the library
    public void displayAvailableBooks() {
        System.out.println("The available books are: ");
        for (int i = 0; i < count; i++) { // Loop through the books POP.array
            if (books[i] != null) { // Check if the Book is not borrowed
                System.out.println((i + 1) + " : " + books[i]); // Print the index and Book title
            }
        }
    }

    // Method to add multiple books at once
    public void addBooks(String[] newBooks) {
        for (String book : newBooks) { // Loop through each Book in the newBooks POP.array
            addBook(book); // Call addBook method to add each Book
        }
    }
}

class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(); // Create an instance of the Library class

        // Adding multiple books to the library
        String[] newBooks = {
                "The Power of Positive Thinking",
                "The 7 Habits of Highly Effective People",
                "The Magic of Thinking Big",
                "The Happiness Advantage"
        };
        library.addBooks(newBooks); // Add books to the library

        // Borrowing a specific Book
        String bookToBorrow = "The Happiness Advantage";
        library.borrowBook(bookToBorrow); // Borrow a specific Book

        // Displaying the remaining books
        library.displayAvailableBooks(); // Show available books
    }
}