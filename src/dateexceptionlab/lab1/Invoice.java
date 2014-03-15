package dateexceptionlab.lab1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Invoice {
  
    private Calendar invoiceDate;
    private int gracePeriod = 15;
    private Calendar dueDate;
    private final DateFormat sdf = DateFormat.getDateInstance(DateFormat.SHORT);

    public Invoice() {
        invoiceDate = Calendar.getInstance();
    }

    //setters
    public final void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public final void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public final void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    //getters
    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
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
    
}
