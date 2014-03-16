package dateexceptionlab.lab3;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Invoice {
  
    private Calendar invoiceDate;
    private int gracePeriod = 15;
    private Calendar dueDate;
    private final DateFormat sdf = DateFormat.getDateInstance(DateFormat.SHORT);
    private static final String INVOICEDATE_ERROR = "invoiceDate can't be null";
    private static final String GRACEPERIOD_ERROR = "gracePeriod must be greater then 0";
    private static final String DUEDATE_NULL_ERROR = "dueDate is null";
    private static final String INVOICE_EQUALS_DUEDATE = "The dueDate is equal to the invoiceDate";
    
    
    public Invoice() {
        invoiceDate = Calendar.getInstance();
    }

    public Calendar getDueDate() {
        dueDate = Calendar.getInstance();
        dueDate = invoiceDate;
        dueDate.add(Calendar.DATE, gracePeriod);
        return dueDate;
    }
    
    public String getDueDateAsString() {
        dueDate = Calendar.getInstance();
        dueDate = invoiceDate;
        dueDate.add(Calendar.DATE, gracePeriod);
        Date date = dueDate.getTime();
        return sdf.format(date);
    }
    
    //setters
    public final void setInvoiceDate(Calendar invoiceDate) throws NullPointerException {
        // check for null
        if (invoiceDate == null) {
            throw new NullPointerException(INVOICEDATE_ERROR);
        }
        this.invoiceDate = invoiceDate;
    }

    public final void setGracePeriod(int gracePeriod) throws IllegalArgumentException {
        //not sure what the max should be, dont know what the invoice is for
        if (gracePeriod < 0 || gracePeriod > 50) {
            throw new IllegalArgumentException(GRACEPERIOD_ERROR);
        }
        this.gracePeriod = gracePeriod;
    }

    public final void setDueDate(Calendar dueDate) throws NullPointerException, IllegalArgumentException {
        //check for null
        if (dueDate == null) {
            throw new NullPointerException(DUEDATE_NULL_ERROR);
        } else if (dueDate.equals(invoiceDate)) { //assumeing there must be a gracePeriod
            throw new IllegalArgumentException(INVOICE_EQUALS_DUEDATE);
        }
        this.dueDate = dueDate;
    }

    //getters
    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }
    
}