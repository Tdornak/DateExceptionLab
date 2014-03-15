
package dateexceptionlab.lab2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DateService {
    
    // MM = months. dd = days. yy = years. hh = hours... a = "AM" or "PM"
    
    public String getSimpleDate(String s) {
        String format = "M/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = new Date();
        try {
            date = sdf.parse(s);
        } catch (ParseException ex) {
            System.out.println("SOMETHING");
        }
        return sdf.format(date);
        
    }
    
    public String getDetailedDate(String s) {
        String format = "MMM dd, yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar cal = Calendar.getInstance();
        try {
            Date date = sdf.parse(s);
            cal.setTime(date);
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
        return cal.getTime().toString();
    }
}
