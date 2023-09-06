package com.bootcoding.junit.array;
//WAP to find the sum of array element and test output with test cases
public class ArraySum {
    public int getSum(int[] numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }
}
