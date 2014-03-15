package dateexceptionlab.lab1;

public class Startup {

    
    
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice();
        System.out.println(invoice.getDueDate());
        System.out.println(invoice.getDueDateAsString());
        
    }
    
}
