/*
Write a Java program to implement a Cinema Ticket Booking System.

Create a class named MovieTicket with the following data members: movieName, ticketPrice and numberOfTickets.

Create a parameterized constructor to initialize the movie name, ticket price and number of tickets.

Implement the following methods:

calculateTotal() - Calculates the total ticket amount using ticket price × number of tickets.
calculateDiscount() - Provides a 10% discount if the number of tickets is 5 or more. Otherwise, no discount is given.
calculateFinalAmount() - Calculates the final amount after deducting the discount.
displayBill() - Displays the movie name, ticket price, number of tickets, discount and final amount.
In the main() method, read the required input values and create a MovieTicket object using the constructor. Invoke the required methods to calculate the total amount, discount and final amount. Finally, display the complete booking bill.

Use separate methods for each calculation and display monetary values with two decimal places.
 */

import java.util.Scanner;

class MovieTicket {

    String movieName;
    double ticketPrice;
    int numberOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0;
    }

    public double calculateFinalAmount() {
        return ticketPrice * numberOfTickets - calculateTotal() * 0.10;
    }

    public void displayBill() {
        System.out.println("---------------Booking Bill---------------");
        System.out.println("Movie Name:- " + movieName);
        System.out.printf("Ticket Price:- " + ticketPrice);
        System.out.println("");
        System.out.println("Number of Tickets:- " + numberOfTickets);
        System.out.printf("Total Amount:- " + calculateTotal());
        System.out.println("");
        System.out.printf("Discount:- " +calculateDiscount());
        System.out.println("");
        System.out.printf("Final Amount:- " +calculateFinalAmount());
    }
}

public class Hackthon2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Movie Name  :-  ");
        String movieName = scr.nextLine();

        System.out.println("Ticket price Each :- ");
        double eachTicketprice = scr.nextDouble();

        System.out.println("Number Of tickets purchased :- " );
        int numberOfickets = scr.nextInt();

        MovieTicket ticket = new MovieTicket(movieName, eachTicketprice, numberOfickets);

        ticket.displayBill();


    }
}
