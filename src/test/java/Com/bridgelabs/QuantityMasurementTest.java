package Com.bridgelabs;

import com.bridgelabs.Feet;
import com.bridgelabs.Inch;
import com.bridgelabs.QuantityMeasurement;
import com.bridgelabs.QuantityMeasurementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Feet feet1 = new Feet(2.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        QuantityMeasurement quantityMasurement = new QuantityMeasurement();
        try {
            boolean feetToInch = quantityMasurement.convertFeetInch(1.0, 12);
            Assertions.assertEquals(feetToInch, true);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullFeet_whenCompare_shouldReturnNotEqual() {
        Feet feet1 = null;
        Feet feet2 = new Feet(2.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetWithSameReference_WhenCompared_ShouldReturnSame() {
        Feet feet = new Feet(0.0);
        Assertions.assertSame(feet, feet);
    }

    @Test
    void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnNotSame() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assertions.assertNotSame(feet, feet1);
    }

    @Test
    void givenFeetWithDifferentType_ShouldReturnNotEqual() {
        Feet feet = new Feet(1.2);
        Inch inch = new Inch(1.2);
        Assertions.assertNotEquals(feet.getClass(), inch.getClass());
    }

    @Test
    void givenFeetWithSameType_ShouldReturnEqual() {
        Feet feet = new Feet(1.2);
        Feet feet1 = new Feet(1.2);
        Assertions.assertEquals(feet.getClass(), feet1.getClass());
    }

    @Test
    void given0Feet1feetForEqualityCheck_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.1);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertFalse(actualValue);
    }

    @Test
    void given0Feet0feetForEqualityCheck_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        boolean actualValue = feet.equals(feet1);
        Assertions.assertTrue(actualValue);
    }

    @Test
    void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assertions.assertEquals(inch, inch1);
    }

    @Test
    void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(1.0);
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenNullInch__WhenCompared_ShouldReturnNotEqual() {
        Inch inch = new Inch(0.0);
        Inch inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnSame() {
        Inch inch = new Inch(0.0);
        Assertions.assertSame(inch, inch);
    }

    @Test
    void givenInchWithDiffrentReference_ShouldReturnNotSame() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assertions.assertNotSame(inch, inch1);
    }

    @Test
    void givenDifferentTypeInch_ShouldReturnNotEqual() {
        Inch inch = new Inch(0.0);
        Feet feet = new Feet(0.0);
        Assertions.assertNotEquals(inch.getClass(), feet.getClass());
    }

    @Test
    void givensameTypeInch_ShouldReturnEqual() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assertions.assertEquals(inch.getClass(), inch1.getClass());
    }

    @Test
    void givenOInch1InchForEqualityCheck_shouldReturnfalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        boolean actualvalue = inch.equals(inch1);
        Assertions.assertFalse(actualvalue);
    }

    @Test
    void givenOInch0InchForEqualityCheck_shouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        boolean actualvalue = inch.equals(inch1);
        Assertions.assertTrue(actualvalue);
    }

    @Test
    void given3FeetAnd1Yard_whenCompare_shouldReturnEquals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        try {
            boolean checkvalue = quantityMeasurement.convertFeetToYard(1.0,3.0);
            Assertions.assertFalse(checkvalue);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }
}