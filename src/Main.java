import pandora.Pandora;
import pandora.Time;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Time t = new Time(1, 3, 5, 7, 2);
        Pandora pandora = new Pandora(t);
        pandora.showTime();

        pandora.convertTimeInSec();
        pandora.convertSecInTime(34072);
        pandora.addSecInTime();
        pandora.addSecInTime(1000);
        pandora.addSecInTime(-5);
    }
}