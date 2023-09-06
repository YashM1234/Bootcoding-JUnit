package com.bootcoding.junit.array;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//Class containing test cases to check does ArraySum class logic is correct or not
public class ArraySumTest {
    @Test
    public void Test1(){
        ArraySum arraySum = new ArraySum();
        int[] numbers = {1, 2, 3, 4, 5};
        int actualSum = arraySum.getSum(numbers);
        int expectedSum = 15;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void Test2(){
        ArraySum arraySum = new ArraySum();
        int[] numbers = {-1, -2, -3, -4, -5};
        int actualSum = arraySum.getSum(numbers);
        int expectedSum = -15;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void Test3(){
        ArraySum arraySum = new ArraySum();
        int[] numbers = {0, 0, 0, 0, 0};
        int actualSum = arraySum.getSum(numbers);
        int expectedSum = 0;
        assertEquals(expectedSum, actualSum);
    }
}