package com.bootcoding.junit.array;
//WAP to find the maximum element from an array and test it using test cases
public class ArrayMaxElement {
    public int maximumElement(int[] numbers){
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }
}
