package pandora.convertor;

public class Days implements SecondsConvertInterface{
    private static final int SEC_IN_MIN = 10;
    private static final int MIN_IN_HOUR = 20;
    private static final int HOUR_IN_DAY = 15;

    @Override
    public int toSeconds(int seconds) {
        return seconds / ( HOUR_IN_DAY * MIN_IN_HOUR * SEC_IN_MIN);
    }
}
