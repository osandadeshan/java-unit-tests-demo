import org.junit.Assert;
import org.junit.Test;

/**
 * Project Name    : java-unit-tests-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 1/16/2021
 * Time            : 3:03 PM
 * Description     :
 **/

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assert.assertEquals(100, calculator.add(60, 40));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(20, calculator.subtract(60, 40));
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(2400, calculator.multiply(60, 40));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(2, calculator.divide(80, 40));
    }
}
