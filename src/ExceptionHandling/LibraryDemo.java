package ExceptionHandling;

// throw and throws

class Library {
    int availableBooks = 4;

    public void borrowBooks(int booksRequestedCount) throws Exception {
             if (booksRequestedCount < availableBooks)
                 throw new Exception("Not enough books available");
             if (booksRequestedCount < 0)
                 throw new Exception("You must request  attlist 1 book");

    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBooks(2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}

//public void borrowBooks(int booksRequestedCount) {
//    try {
//        if (booksRequestedCount < availableBooks)
//            throw new Exception("Not enough books available");
//    } catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Exception your Requested a book that disant exited");
//    } catch (Exception e) {
//        System.out.println("Exception");
//    } finally {
//        System.out.println("finally book");
//    }



//public void borrowBooks(int booksRequested) {
//    try {
//        int[] books = {101, 102, 103,};
//        System.out.println("Book Requested : " + books[booksRequested]);
//    } catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Exception your Requested a book that disant exited");
//    } catch (Exception e) {
//        System.out.println("nullPointerException");
//    } finally {
//        System.out.println("finally book");
//    }



