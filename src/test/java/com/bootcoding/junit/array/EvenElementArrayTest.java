package com.bootcoding.junit.array;
import org.junit.Test;
import static org.junit.Assert.*;
//Class containing all test cases to check does EvenElementArray class logic is correct or not
public class EvenElementArrayTest {
    @Test
    public void Test1(){
        EvenElementArray evenElementArray = new EvenElementArray();
        int[] numbers = {0, 2, 5, 7, 6};
        int[] actualResult = evenElementArray.getEvenElementArray(numbers);
        int[] expectedResult = {0, 2, 6};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void Test2(){
        EvenElementArray evenElementArray = new EvenElementArray();
        int[] numbers = {0, -2, -5, -7, -6};
        int[] actualResult = evenElementArray.getEvenElementArray(numbers);
        int[] expectedResult = {0, -2, -6};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void Test3(){
        EvenElementArray evenElementArray = new EvenElementArray();
        int[] numbers = {100, -2, 5, -7, -6, 39};
        int[] actualResult = evenElementArray.getEvenElementArray(numbers);
        int[] expectedResult = {100, -2, -6};
        assertArrayEquals(expectedResult, actualResult);
    }
}