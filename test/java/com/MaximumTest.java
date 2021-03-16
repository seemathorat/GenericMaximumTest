package com;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumTest{
    Maximum Max;

    @Before
    public void set() throws Exception {
        Max = new Maximum();
    }
    @Test

    public void given_Max_Number_IS_Greater_First_Position_number_Returns_True_Test() {
        int result = Max.getIntegerMaximum(9,4,5);
        Assert.assertEquals(9, result);
    }

    @Test
    public void given_Max_Number_IS_Greater_Second_Position_number_Returns_True_Test() {
        int result = Max.getIntegerMaximum(4,9,5);
        Assert.assertEquals(9, result);
    }

    @Test
    public void given_Max_Number_IS_Greater_Third_Position_number_Returns_True_Test() {
        int result = Max.getIntegerMaximum(4,5,9);
        Assert.assertEquals(9,result);
    }
}