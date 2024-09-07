package test.java;

import org.junit.Test;
import pandora.Pandora;
import pandora.Time;
import pandora.TimeCalculator;

public class PandoraTest {
    @Test
    public void testConventTimeInSec() {
        Time t = new Time(1, 3, 5, 7, 2);
        Pandora pandora = new Pandora(t);
        pandora.convertTimeInSec();

        TimeCalculator tc = new TimeCalculator(t);
        int seconds = tc.convertTimeIntoSec();
    }

}
