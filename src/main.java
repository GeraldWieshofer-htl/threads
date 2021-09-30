public class main {
    public static void main(String[] args) {

        CountPrinter c=new CountPrinter();
        DatePrinter d=new DatePrinter();

        Thread th1=new Thread(c);
        Thread th2=new Thread(d);

        th1.start();
        th2.start();
    }

}
