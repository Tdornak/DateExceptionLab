
package dateexceptionlab.lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateService {
    
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
        String format = "MMMMMMMMMM dd, yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        try {
            date = sdf.parse(s);
            cal.setTime(date);
            date = cal.getTime();
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
        return sdf.format(date);
    }
}