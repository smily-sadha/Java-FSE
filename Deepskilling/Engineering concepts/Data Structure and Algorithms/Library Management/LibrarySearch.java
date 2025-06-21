import java.util.*;

public class LibrarySearch {

    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = books[mid].title.compareToIgnoreCase(targetTitle);

            if (comparison == 0) return books[mid];
            else if (comparison < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void sortByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
    }

    public static void displayBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
