package com.bootcoding.junit.array;
//WAP to get only even number array from the given array and test it with test cases
public class EvenElementArray {
    public int[] getEvenElementArray(int[] numbers){
        int count = 0;
        for(int number: numbers){
            if(number%2 == 0){
                count++;
            }
        }
        int[] evenNumbers = new int[count];
        for(int i = 0, j = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                evenNumbers[j++] = numbers[i];
            }
        }
        return evenNumbers;
    }
}
