package dateexceptionlab.lab3;

public class Startup {

    public static void main(String[] args) {
        //lab 1
        Invoice invoice = new Invoice();
        System.out.println(invoice.getDueDate());
        System.out.println(invoice.getDueDateAsString());

        //lab 2
        DateService date = new DateService();
        System.out.println(date.getSimpleDate("3/15/2014"));
        System.out.println(date.getDetailedDate("March 15, 2014 2:30 PM"));
    }
}