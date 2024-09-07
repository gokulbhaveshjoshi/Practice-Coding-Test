package pandora;

public class Pandora {
    Time time;
    public Pandora(Time time) {
        this.time = time;
    }
    public  void convertTimeInSec() {
        TimeCalculator timeCalculator = new TimeCalculator(this.time);
        int seconds = timeCalculator.convertTimeIntoSec();
        System.out.println(seconds);
    }

    public  void convertSecInTime (int seconds) {
        TimeCalculator tc = new TimeCalculator(null);
        this.time = tc.convertSecIntoTime(seconds);
        showTime();
    }

    public  void addSecInTime(){
        TimeCalculator tc = new TimeCalculator(this.time);
        tc.addOneSecInTime();
        showTime();
    }

    public void addSecInTime(int seconds) throws Exception {
        if (seconds < 0) {
            throw new Exception("Seconds should be positive");
        }
        TimeCalculator tc = new TimeCalculator(this.time);
        int currTimeInSeconds = tc.convertTimeIntoSec();
        this.time = tc.convertSecIntoTime(currTimeInSeconds + seconds);
        showTime();
    }

    public Time getTime() {
        return time;
    }

    public void showTime() {
        System.out.println(formatTime());
    }

    private String formatTime() {
        return "Month " +
                String.format("%02d", time.month) + ", Day " + String.format("%02d", time.day) + "\t" +
                String.format("%02d", time.hour) +":" + String.format("%02d", time.minute) + ":" + String.format("%02d", time.seconds);

    }
}

/*
Pandora Clock
10 sec= 1 min
20 min = 1 hour
15 hour = 1 day
8 days = 1 month
 */
