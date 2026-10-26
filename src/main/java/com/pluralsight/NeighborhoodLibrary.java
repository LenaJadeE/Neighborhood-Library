package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static final int inventorySize = 20;

    private static final Book[] inventory = new Book[inventorySize];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadInventory();
        showHomeScreen();
    }

    private static void loadInventory() {
        inventory[0] = new Book(1, "9780063473324", "To Kill a Mockingbird", "Harper Lee", 1960, "HarperCollins Deluxe Collector's Edition");
        inventory[1] = new Book(2, "9780151660346", "1984", "George Orwell", 1949, "Harcourt Edition");
        inventory[2] = new Book(3, "9780743273565", "The Great Gatsby", "F. Scott Fitzgerald", 1925, "First Edition");
        inventory[3] = new Book(4, "9780141040349", "Pride and Prejudice", "Jane Austen", 1813, "Penguin Clothbound Classics Edition");
        inventory[4] = new Book(5, "9780618968633", "The Hobbit", "J.R.R. Tolkien", 1937, "Houghton Mifflin Edition");
        inventory[5] = new Book(6, "9780590353403", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, "Scholastic First US Edition");
        inventory[6] = new Book(7, "9780316769174", "The Catcher in the Rye", "J.D. Salinger", 1951, "Little, Brown Edition");
        inventory[7] = new Book(8, "9780141040363", "Jane Eyre", "Charlotte Bronte", 1847, "Penguin Clothbound Classics Edition");
        inventory[8] = new Book(9, "9780060929871", "Brave New World", "Aldous Huxley", 1932, "Perennial Classics Edition");
        inventory[9] = new Book(10, "9780060929872", "The Alchemist", "Paulo Coelho", 1988, "Alchemist Deluxe Edition");
        inventory[10] = new Book(11, "9780060263850", "Charlotte's Web", "E.B. White", 1952, "Harper & Row Edition");
        inventory[11] = new Book(12, "9780395645666", "The Giver", "Lois Lowry", 1993, "Houghton Mifflin Edition");
        inventory[12] = new Book(13, "9781503280786", "Moby Dick", "Herman Melville", 1851, "Moby-Dick Limited Edition");
        inventory[13] = new Book(14, "9780451532244", "Frankenstein", "Mary Shelley", 1818, "Norton Critical Editions");
        inventory[14] = new Book(15, "9780441013593", "Dune", "Frank Herbert", 1965, "Ace Edition");
        inventory[15] = new Book(16, "9780439023481", "The Hunger Games", "Suzanne Collins", 2008, "Scholastic Press Edition");
        inventory[16] = new Book(17, "9780141192413", "Little Women", "Louisa May Alcott", 1868, "Penguin Clothbound Classics Edition");
        inventory[17] = new Book(18, "9781442004788", "The Outsiders", "S.E. Hinton", 1967, "Paw Prints Library Binding edition");
        inventory[18] = new Book(19, "9781451673319", "Fahrenheit 451", "Ray Bradbury", 1953, "Clothbound Special Edition");
        inventory[19] = new Book(20, "9780374386139", "A Wrinkle in Time", "Madeleine L'Engle", 1962, "Farrar, Straus and Giroux Edition");
    }

    private static void showHomeScreen() {
        String choice;

        do {
            System.out.println();
            System.out.println("Welcome to Neighborhood Library");
            System.out.println("What would you like to do?");
            System.out.println("  1 - Show Available Books");
            System.out.println("  2 - Show Checked Out Books");
            System.out.println("  3 - Update a Book");
            System.out.println("  4 - Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showAvailableBooks();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "3":
                    updateBook();
                    break;
                case "4":
                    System.out.println("Thank you for using Neighborhood Library");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3 or 4.");
            }
        } while (!choice.equals("4"));
    }

    private static void showAvailableBooks() {
        System.out.println();
        System.out.println("Available Books:");

        int count = 0;
        for (Book book : inventory) {
            if (!book.isCheckedOut()) {
                System.out.printf("ID: %-3d ISBN: %-14s Title: %-38s Author: %-20s Published: %-5d Edition: %s%n",
                        book.getID(), displayISBN(book), book.getTitle(), book.getAuthor(),
                        book.getPublicationYear(), book.getEdition());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books available right now.");
            return;
        }

        System.out.println();
        System.out.print("Enter the ID of the book to check out, or X to go back: ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("x")) {
            return;
        }

        Book book = findBook(input);
        if (book == null) {
            System.out.println("No book found with that ID.");
        } else if (book.isCheckedOut()) {
            System.out.println("Sorry, that book is already checked out.");
        } else {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("A name is required to check out a book.");
            } else {
                book.checkOut(name);
                System.out.println("\"" + book.getTitle() + "\" is now checked out to " + name + ".");
            }
        }
    }

    private static void showCheckedOutBooks() {
        System.out.println();
        System.out.println("Checked Out Books:");

        int count = 0;
        for (Book book : inventory) {
            if (book.isCheckedOut()) {
                System.out.printf("ID: %-3d ISBN: %-14s Title: %-38s Author: %-20s Published: %-5d Edition: %-40s Checked out to: %s%n",
                        book.getID(), displayISBN(book), book.getTitle(), book.getAuthor(),
                        book.getPublicationYear(), book.getEdition(), book.getCheckedOutTo());
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No books are checked out right now.");
            return;
        }

        System.out.println();
        System.out.println(" C - Check In a book");
        System.out.println(" x - Go back to home screen");
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine().trim();

        if (choice.equalsIgnoreCase("c")) {
            checkInBook();
        } else if (!choice.equalsIgnoreCase("x")) {
            System.out.println("Invalid choice. Returning to the home screen.");
        }
    }

    private static void checkInBook() {
        System.out.print("Enter the ID of the book to check in: ");
        String input = scanner.nextLine().trim();

        Book book = findBook(input);
        if (book == null) {
            System.out.println("No book found with that ID.");
        } else if (!book.isCheckedOut()) {
            System.out.println("That book is not checked out.");
        } else {
            book.checkIn();
            System.out.println("\"" + book.getTitle() + "\" has been checked in. Thank you!");
        }
    }

    private static void updateBook() {
        System.out.print("Enter the ID of the book to update: ");
        Book book = findBook(scanner.nextLine().trim());

        if (book != null) {
            System.out.println("  1 - ID");
            System.out.println("  2 - ISBN");
            System.out.println("  3 - Title");
            System.out.println("  4 - Author");
            System.out.println("  5 - Publication Year");
            System.out.println("  6 - Edition");
            System.out.print("What would you like to change? ");
            String field = scanner.nextLine().trim();

            System.out.print("Enter the new value: ");
            String value = scanner.nextLine().trim();

            try {
                switch (field) {
                    case "1":
                        if (findBook(Integer.parseInt(value)) != null) {
                            System.out.println("That ID is already in use.");
                            return;
                        }
                        book.setID(Integer.parseInt(value));
                        break;
                    case "2":
                        book.setISBN(value);
                        break;
                    case "3":
                        book.setTitle(value);
                        break;
                    case "4":
                        book.setAuthor(value);
                        break;
                    case "5":
                        book.setPublicationYear(Integer.parseInt(value));
                        break;
                    case "6":
                        book.setEdition(value);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }
                System.out.println("Book updated.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        } else {
            System.out.println("No book found with that ID.");
        }
    }

    private static Book findBook(int id) {
        Book found = null;
        for (Book book : inventory) {
            if (book.getID() == id) {
                found = book;
                break;
            }
        }
        return found;
    }

    private static Book findBook(String idText) {
        try {
            return findBook(Integer.parseInt(idText));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static String displayISBN(Book book) {
        if (book.getISBN().isEmpty()) {
            return "pending";
        }
        return book.getISBN();
    }
}