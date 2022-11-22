public class Book {

    String bookName;
    Author bookAuthorName;
    int bookYear;

    public Book(String bookName, Author bookAuthorName, int bookYear) {

        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookYear = bookYear;

    }

    public String getBookName() {

        return bookName;

    }

    public Author getBookAuthorName() {

        return bookAuthorName;

    }

    public int getBookYear() {

        return  bookYear;

    }

    public void setBookYear(int bookYear) {

        this.bookYear = bookYear;

    }






}
