package com.bridgelabs;

public class QuantityMeasurementException extends Exception {
    private final Object type;

    enum ExceptionType{
        ENTERED_VALUE_NOT_EQUAL, FEET_TO_YARD;

    }

    public QuantityMeasurementException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
