package com.bridgelabs;

/**
 *author pallavi jagtap
 * @version 0.0.1
 * @since 4-11-2021
 * this methode is converting feet to inch value
 */
public class QuantityMeasurement {
    public boolean convertFeetInch(double feet, int inch) throws QuantityMeasurementException {
        double feetCoversion = feet * 12;
        if (feetCoversion != inch)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.ENTERED_VALUE_NOT_EQUAL, "please enter values that should be matched");
        return true;
    }

    /**
     * *author pallavi jagtap
     *   @version 0.0.1
     *   @since 4-11-2021
     * @param feet
     * @param yard
     * @return
     * @throws QuantityMeasurementException
     */

    public boolean convertFeetToYard(double feet, double yard) throws QuantityMeasurementException {
        double feetCoversion = yard * 3;
        if (feetCoversion != feet)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.FEET_TO_YARD, "please enter values that should be matched");
        return true;
    }
}



