import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public static String dateToDay(String inputDate, DateFormat dateFormat) throws ParseException {
        String day;

        Date date = dateFormat.parse(inputDate);    //may throw parse exception
        DateFormat finalFormat = new SimpleDateFormat("EEEE");

        day = finalFormat.format(date);
        return day;
    }
}
