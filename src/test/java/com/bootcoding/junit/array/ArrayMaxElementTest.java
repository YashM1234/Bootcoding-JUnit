package com.bootcoding.junit.array;
import org.junit.Test;
import static org.junit.Assert.*;
//Class containing all test cases to check does ArrayMaxElement class logic is correct or not
public class ArrayMaxElementTest {
    @Test
    public void Test1(){
        ArrayMaxElement arrayMaxElement = new ArrayMaxElement();
        int[] numbers = {5, 6, -8, 6, 9};
        int actualResult = arrayMaxElement.maximumElement(numbers);
        int expectedResult = 9;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test2(){
        ArrayMaxElement arrayMaxElement = new ArrayMaxElement();
        int[] numbers = {55, 6, -8, 6, 9};
        int actualResult = arrayMaxElement.maximumElement(numbers);
        int expectedResult = 55;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test3(){
        ArrayMaxElement arrayMaxElement = new ArrayMaxElement();
        int[] numbers = {55, 6, -8, 60, 9};
        int actualResult = arrayMaxElement.maximumElement(numbers);
        int expectedResult = 60;
        assertEquals(expectedResult, actualResult);
    }
}