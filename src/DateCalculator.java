import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mason Schmidgall on 12/17/2015.
 */
public class DateCalculator {

    private Calendar calendar;  //calendar for calculating date
    private Date startDate;
    private Date endDate;

    public DateCalculator() {
        calendar = Calendar.getInstance();
        
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
