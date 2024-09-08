package pandora.convertor;

public class Hours implements SecondsConvertInterface{
    private static final int SEC_IN_MIN = 10;
    private static final int MIN_IN_HOUR = 20;

    @Override
    public int toSeconds(int seconds) {
        return seconds / ( MIN_IN_HOUR * SEC_IN_MIN);
    }
}
