import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task1 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
        Calendar calGetTask = Calendar.getInstance();
        calGetTask.set(Calendar.YEAR,2022);
        calGetTask.set(Calendar.MONTH,Calendar.SEPTEMBER);
        calGetTask.set(Calendar.DAY_OF_MONTH,15);
        calGetTask.set(Calendar.HOUR,9);
        calGetTask.set(Calendar.MINUTE,2);
        Calendar calCur = Calendar.getInstance();
        System.out.print("Агафонов, задание получено: " + sdf.format(calGetTask.getTime()) + ", задание сдано: "+sdf.format(calCur.getTime()));
    }


}
