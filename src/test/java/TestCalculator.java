import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {


    @Test
    public void can_add(){
        int number1 = 3;
        int number2 = 4;
        assertEquals(7, Calculator.add(number1, number2));
    }

    @Test
    public void can_subtract(){
        int number1 = 5;
        int number2 = 2;
        assertEquals(3, Calculator.subtract(number1, number2));
    }

    @Test
    public void can_multiply(){
        int number1 = 2;
        int number2 = 3;
        assertEquals(6, Calculator.multiply(number1, number2));
    }

    @Test
    public void can_divide(){
        double number1 = 6.00;
        double number2 = 3.00;
        assertEquals(2.00, Calculator.divide(number1, number2));
    }

}
