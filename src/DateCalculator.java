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

    /**
     * Contructor.
     * sets everything to default settings.
     * Pre: none.
     * post: a DateCalculator Object has been created.
     */
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

    /**
     * Returns a String containing the day for the given input.
     * Pre: dateFormat must contain a day, month and year within it somewhere.
     * Post: a String representing a day has been returned.
     * @param inputDate Date to get Day of the week for. Must match dateFormat pattern!
     * @param dateFormat Pattern for the inputDate. Must contain a month, day and year!
     * @return String representing the day of the week for the input date.
     * @throws ParseException Thrown if pattern doesn't match with inputDate.
     */
    public static String dateToDay(String inputDate, DateFormat dateFormat) throws ParseException {
        String day;

        Date date = dateFormat.parse(inputDate);    //may throw parse exception
        DateFormat finalFormat = new SimpleDateFormat("EEEE");

        day = finalFormat.format(date);
        return day;
    }
}
