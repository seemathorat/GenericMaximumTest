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


    @Test
    public void given_Max_Double_Number_IS_Greater_first_Position_number_Returns_True_Test() {
        double result = Max.getDoubleMaximum(9.0,4.0,5.0);
        Assert.assertEquals(9.0, result, 0.001);
    }

    @Test
    public void given_Max_Double_Number_IS_Greater_Second_Position_number_Returns_True_Test() {
        double result = Max.getDoubleMaximum(4.0,9.0,5.0);
        Assert.assertEquals(9.0, result,0.001);
    }

    @Test
    public void given_Max_Double_Number_IS_Greater_Third_Position_number_Returns_True_Test() {
        double result = Max.getDoubleMaximum(5.0,4.0,9.0);
        Assert.assertEquals(9.0,result,0.001);
    }

    @Test
    public void given_Max_String_IS_Greater_First_Position_number_Returns_True_Test() {
        String result = Max.getStringMaximum("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_Max_String_IS_Greater_Second_Position_number_Returns_True_Test() {
        String result = Max.getStringMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_Max_String_IS_Greater_Third_Position_number_Returns_True_Test() {
        String result = Max.getStringMaximum("Apple", "Peach", "banana");
        Assert.assertEquals("banana", result);
    }
}