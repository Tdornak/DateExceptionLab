package dateexceptionlab.lab4;

import java.text.ParseException;

public class Startup {

    public static void main(String[] args) {
        //lab 1
        Invoice invoice = new Invoice();
        try {
            System.out.println(invoice.getDueDate());
            System.out.println(invoice.getDueDateAsString());
        } catch (NullPointerException | IllegalArgumentException npe) {
            System.out.println(npe.getMessage());
        }
        
        System.out.println("\n");
        
        //lab 2
        DateService date = new DateService();
        try {
            System.out.println(date.getSimpleDate("3/15/2014"));
            System.out.println(date.getDetailedDate("March 15, 2014 2:30 PM"));
            System.out.println(date.getSimpleDate("3-15-2014"));
        } catch (IllegalArgumentException | ParseException npe) {
            System.out.println(npe.getMessage());
        }
        
    }
}