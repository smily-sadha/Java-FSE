public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "The Alchemist", "Paulo Coelho"),
                new Book(2, "To Kill a Mockingbird", "Harper Lee"),
                new Book(3, "1984", "George Orwell"),
                new Book(4, "Pride and Prejudice", "Jane Austen")
        };

        System.out.println("All Books:");
        LibrarySearch.displayBooks(books);

        Book found1 = LibrarySearch.linearSearch(books, "1984");
        System.out.println("\nLinear Search Result: " + (found1 != null ? found1 : "Book not found"));

        LibrarySearch.sortByTitle(books);

        Book found2 = LibrarySearch.binarySearch(books, "1984");
        System.out.println("\nBinary Search Result: " + (found2 != null ? found2 : "Book not found"));
    }
}
