import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {


    SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy hh:mm");
    String date=dateformat.format(new Date());

    @Override
    public void run() {
        for(int i=1;i<21;i++){
            System.out.println(date);
        }
    }
}
