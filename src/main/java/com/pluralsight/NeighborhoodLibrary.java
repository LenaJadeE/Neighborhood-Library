package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static final int INVENTORY_SIZE = 20;

    private static final Book[] inventory = new Book[INVENTORY_SIZE];
    private static final Scanner scanner = new Scanner(System.in);

    public static  void main(String[] args) {
        loadInventory();
        showHomeScreen();
    }

    private static void loadInventory {
        inventory[0] = new Book(1, "9780063473324", "To Kill a Mockingbird", "Harper Lee", 1960, "HarperCollins Deluxe Collector's Edition");
        inventory[1] = new Book(2, "9780151660346", "1984", "George Orwell", 1949, "Harcourt Edition");
        inventory[2] = new Book(3, "9780743273565", "The Great Gatsby", "F. Scott Fitzgerald", 1925, "First Edition");
        inventory[3] = new Book(4, "9780141040349", "Pride and Prejudice", "Jane Austen", 1813, "Penguin Clothbound Classics Edition");
        inventory[4] = new Book(5, "9780618968633", "The Hobbit", "J.R.R. Tolkien", 1937, "Houghton Mifflin Edition");
        inventory[5] = new Book(6, "9780590353403", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, "Scholastic First US Edition");
        inventory[6] = new Book(7, "9780316769174", "The Catcher in the Rye", "J.D. Salinger", 1951, "Little, Brown Edition");
        inventory[7] = new Book(8, "9780141040363", "Jane Eyre", "Charlotte Bronte", 1847, "Penguin Clothbound Classics Edition");
        inventory[8] = new Book(9, "9780060929871", "Brave New World", "Aldous Huxley", 1932, "Perennial Classics Edition");
        inventory[9] = new Book(10, "9780060929871", "The Alchemist", "Paulo Coelho", 1988, "Alchemist Deluxe Edition");
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
}
