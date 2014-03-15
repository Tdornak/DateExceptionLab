package dateexceptionlab.lab2;


public class Startup {
    
    public static void main(String[] args) {
        
        DateService date = new DateService();
        System.out.println(date.getSimpleDate("3/15/2014"));
        
        System.out.println(date.getDetailedDate("March 15, 2014 2:30 PM"));
    }
        
}
