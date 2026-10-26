package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private String edition;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int ID, String ISBN, String title, String author, int publicationYear, String edition) {
        this.id = ID;
        this.isbn = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.edition = edition;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public Book(int ID, String ISBN, String title, String author, int publicationYear,
                String edition, boolean isCheckedOut, String checkedOutTo) {
        this.id = ID;
        this.isbn = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.edition = edition;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOut(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        setCheckedOutTo(name);
        setCheckedOut(true);
    }

    public void checkIn() {
        setCheckedOutTo("");
        setCheckedOut(false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id);
        sb.append(" | ISBN: ").append(isbn);
        sb.append(" | Title: ").append(title);
        sb.append(" | Author: ").append(author);
        sb.append(" | Published: ").append(publicationYear);
        sb.append(" | Edition: ").append(edition);
        if (isCheckedOut) {
            sb.append(" | Checked out to: ").append(checkedOutTo);
        }
        return sb.toString();
    }
}
// Requirements
//   Create a Book class with appropriate getters, setters, constructors and methods.
//   The class should have the following properties:
//       Properties - - - - -
//          ID: int
//          ISBN: String
//          title: String
//          isCheckedOut: boolean
//          checkedOutTo: String
//       Methods  -
//          void checkOut(String name) -
//          void checkIn()
//   Use an array to hold an inventory of at least 20 books of your choice
//   Each book must have a unique id
//   When a book is checked out
//       the book's checkedOutTo variable should be set to the name provided
//       the isCheckedOut variable should be set to true
//   When a book is checked in
//       the book's checkedOutTo variable should be set to ""
//       the isCheckedOut variable should be set to false
//  Screens
//   The Home Screen - The home screen should display a list of options that a user can choose from.
//       Show Available Books
//       Show Checked Out Books
//       Exit - closes out of the application
//   Show Available Books - Displays a list of all books that are not currently checked out.
//   Display the ID, ISBN and Title of the book.
//       Prompt the user to either select a book to check out, or exit to go back to the home screen
//       If the user wants to check out a book, prompt them for their name
//       Then check out the book
//   Show Checked Out Books
//       This displays a list of all the books that are currently checked out.
//   Display the ID, ISBN, Title and Name of the person who has the book checked out.
//       Prompt the user to:
//          C - to Check In a book
//          X - to go back to the home screen
//   Check In a book - Prompt the user for the ID of the book they want to check in.
//       Check in the book with the specified ID
//       Go back to the home screen
//   You should:
//       Have a clean and intuitive user interface (give the user clear instructions on each screen)
//   You should adhere to best practices such as:
//       Create a Java Project that follows the Maven folder structure
//       Create appropriate Java packages and classes
//       Class names should be meaningful and follow proper naming conventions (PascalCase)
//       Use good variable naming conventions (lowerCamelCasing, meaningful variable names)
//       Your code should be properly formatted and easy to understand
//       Use Java comments effectively
//   Make sure that:
//       Your code is free of errors and that it compiles and runs