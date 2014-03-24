
package dateexceptionlab.lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateService {
    
    public static final String PARSE_EXCEPTION = "ParseException Error, offset is: ";
    public static final String STRING_NULL = "Must not be null";
    public static final String STRING_LENGTH_ERROR = "Incorrect Format";
    public static final String ILLEGAL_FORMAT_ERROR = "Must use \"/\" as seperator";
    
    public String getSimpleDate(String s) throws IllegalArgumentException, ParseException, DateFormatException {
        if (s == null) { //check null
            throw new IllegalArgumentException(STRING_NULL);
            //check length
        } else if (s.length() < 9 && s.length() > 10) {
            throw new IllegalArgumentException(STRING_LENGTH_ERROR);
        } 
        int count = 0; // look for "/" in the string
        for (int counter = 1; counter < s.length(); counter++) {
            if (s.charAt(counter) == '/') {
                count += 1;
            }
        } // check that "/" was used as the seperator
        if (count != 2) {
            throw new DateFormatException(ILLEGAL_FORMAT_ERROR);
        }
        String format = "M/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = new Date();
        try {
            date = sdf.parse(s);
        } catch (ParseException ex) {
            throw new ParseException(PARSE_EXCEPTION, ex.getErrorOffset());
        }
        return sdf.format(date);
    }
    
    public String getDetailedDate(String s) throws IllegalArgumentException, ParseException {
        if (s == null) { //check null
            throw new IllegalArgumentException(STRING_NULL);
            //check length
        } else if (s.length() < 17 && s.length() > 27) {
            throw new IllegalArgumentException(STRING_LENGTH_ERROR);
        } 
        String format = "MMMMMMMMM dd, yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        try {
            date = sdf.parse(s);
            cal.setTime(date);
            date = cal.getTime();
        } catch (ParseException ex) {
            throw new ParseException(PARSE_EXCEPTION, ex.getErrorOffset());
        }
        return sdf.format(date);
    }
}