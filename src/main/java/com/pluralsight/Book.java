package com.pluralsight;

public class Book {
    private
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