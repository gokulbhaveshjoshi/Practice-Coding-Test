package pandora;

import pandora.convertor.Days;
import pandora.convertor.Hours;
import pandora.convertor.Minutes;
import pandora.convertor.Month;

public class TimeCalculator {
    private static final int SEC_IN_MIN = 10;
    private static final int MIN_IN_HOUR = 20;
    private static final int HOUR_IN_DAY = 15;
    private static final int DAY_IN_MONTH = 8;
    private int seconds;
    private Time time;
    public TimeCalculator(Time time) {
        this.time = time;
    }

    public void addOneSecInTime(){
        if (this.time.seconds == 9) {
            this.time.seconds = 0;
            addOneMinInTime();
        }
        this.time.seconds++;
    }

    public void addOneMinInTime() {
        if (this.time.minute == 19) {
            this.time.minute = 0;
            addOneHourInTime();
        }
        this.time.minute++;
    }

    public void addOneHourInTime() {
        if (this.time.hour == 14) {
            this.time.hour = 0;
            addOneDayInTime();
        }
        this.time.hour++;
    }

    public void addOneDayInTime(){
        if (this.time.day == 7) {
            this.time.day = 0;
            addOneMonthInTime();
        }
        this.time.day++;
    }

    public void addOneMonthInTime() {
        this.time.month++;
    }

    public int convertTimeIntoSec() {
        return time.seconds + (time.minute * SEC_IN_MIN) + (time.hour * MIN_IN_HOUR * SEC_IN_MIN)
                + (time.day * HOUR_IN_DAY * MIN_IN_HOUR * SEC_IN_MIN)
                + (time.month * DAY_IN_MONTH * HOUR_IN_DAY * MIN_IN_HOUR * SEC_IN_MIN);
    }

    public Time convertSecIntoTime(int seconds) {
        int month = new Month().toSeconds(seconds);
        seconds = seconds % (DAY_IN_MONTH * HOUR_IN_DAY * MIN_IN_HOUR * SEC_IN_MIN);

        int days = new Days().toSeconds(seconds);
        seconds %= ( HOUR_IN_DAY * MIN_IN_HOUR * SEC_IN_MIN);

        int hours = new Hours().toSeconds(seconds);
        seconds %= ( MIN_IN_HOUR * SEC_IN_MIN);

        int minutes = new Minutes().toSeconds(seconds);
        seconds %= SEC_IN_MIN;

        Time newTime = new Time(month, days, hours, minutes, seconds);
        return newTime;
    }
}
