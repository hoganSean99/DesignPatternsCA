package MembersDecoratorTests;

import MembersDecorator.*;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.*;

public class MemberDiscountTest {

    @Test
    public void whenGettingDiscount_makeSureItIsCorrectRate()
    {
        MemberDiscount studentWithHalfPrice = new StudentDiscount();
        studentWithHalfPrice = new HalfPrice(studentWithHalfPrice);

        double expectedResult = 0.6;
        double actualResult   = studentWithHalfPrice.discountRate();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfTestFailsWhenDiscountRateIsIncorrect()
    {
        MemberDiscount studentWithHalfPrice = new StudentDiscount();
        studentWithHalfPrice = new HalfPrice(studentWithHalfPrice);

        double expectedResult = 0.61;
        double actualResult   = studentWithHalfPrice.discountRate();

        assertNotSame(expectedResult, actualResult);
    }
}
