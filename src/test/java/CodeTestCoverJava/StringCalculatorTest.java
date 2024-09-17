package CodeTestCoverJava;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        StringCalculator  objUnderTest=new StringCalculator();
        assertTrue(objUnderTest.add("")==0);
    }

  
}
