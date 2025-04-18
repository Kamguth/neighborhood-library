package com.pluralsight;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] inventory = new Book[20];
        inventory[0] = new Book(1, "ISBN001", "The Great Gatsby");
        inventory[1] = new Book(2, "ISBN002", "1984");
        inventory[2] = new Book(3, "ISBN003", "To Kill a Mockingbird");
        inventory[3] = new Book(4, "ISBN004", "Moby Dick");
        inventory[4] = new Book(5, "ISBN005", "Pride and Prejudice");
        inventory[5] = new Book(6, "ISBN006", "My Side of The Mountain");
        inventory[6] = new Book(7, "ISBN007", "The Lord of the Rings");
        inventory[7] = new Book(8, "ISBN008", "The Hobbit");
        inventory[8] = new Book(9, "ISBN009", "Harry Potter and the Sorcerer's Stone");
        inventory[9] = new Book(10, "ISBN010", "War and Peace");
        inventory[10] = new Book(11, "ISBN011", "Star Wars EP. 3");
        inventory[11] = new Book(12, "ISBN012", "The Odyssey");
        inventory[12] = new Book(13, "ISBN013", "One Hundred Years of Solitude");
        inventory[13] = new Book(14, "ISBN014", "The Chronicles of Narnia");
        inventory[14] = new Book(15, "ISBN015", "Frankenstein");
        inventory[15] = new Book(16, "ISBN016", "Dracula");
        inventory[16] = new Book(17, "ISBN017", "Hamlet");
        inventory[17] = new Book(18, "ISBN018", "Skyrim ES 5");
        inventory[18] = new Book(19, "ISBN019", "Fahrenheit 451");
        inventory[19] = new Book(20, "ISBN020", "Animal Farm");

        boolean running = true;

        while (running) {
            System.out.println("\nKam's Book Store Menu:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Check In a Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("\nAvailable Books:");
                for (Book book : inventory) {
                    if (!book.isCheckedOut()) {
                        System.out.println(book);
                    }
                }
            } else if (option == 2) {
                System.out.println("\nChecked Out Books:");
                for (Book book : inventory) {
                    if (book.isCheckedOut()) {
                        System.out.println(book);
                    }
                }

            }else if (option == 3) {
                System.out.println("\nBooks Available For Checkout:");
                for (Book book : inventory) {
                    if (!book.isCheckedOut()) {
                        System.out.println(book);
                    }
                }
            }

        }
    }
}




