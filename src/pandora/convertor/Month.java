package pandora.convertor;

public class Month implements SecondsConvertInterface{
    private static final int SEC_IN_MIN = 10;
    private static final int MIN_IN_HOUR = 20;
    private static final int HOUR_IN_DAY = 15;
    private static final int DAY_IN_MONTH = 8;
    @Override
    public  int toSeconds(int seconds) {
        return seconds / (DAY_IN_MONTH * HOUR_IN_DAY * MIN_IN_HOUR * SEC_IN_MIN);
    }
}
