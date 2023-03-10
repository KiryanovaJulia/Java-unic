import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {

    private int idNumber;

    private int totalPoints;

    private Calendar birthdayDate;

    Student(int idNumber, int totalPoints, int dayBirthday, int mouthBirthday, int yearBirthday) {
        this.idNumber = idNumber;
        this.totalPoints = totalPoints;
        this.birthdayDate = Calendar.getInstance();
        this.birthdayDate.set(Calendar.DAY_OF_MONTH,dayBirthday);
        this.birthdayDate.set(Calendar.MONTH,mouthBirthday-1);
        this.birthdayDate.set(Calendar.YEAR,yearBirthday);
    }

    Student(int idNumber, int dayBirthday, int mouthBirthday, int yearBirthday) {
        this(idNumber, 0, dayBirthday, mouthBirthday, yearBirthday);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        return sdf.format(this.birthdayDate.getTime());
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
