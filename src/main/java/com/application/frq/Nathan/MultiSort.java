package com.application.frq.Nathan;

import java.util.Arrays;

public class MultiSort<T> {

    public <T extends Comparable<T>> T[] insertionSort(T[] arr){

        for(int i=1;i<arr.length; i++){

            int index1 = i;
            int index2 = i-1;
            while (index2 >= 0 && arr[index1].compareTo(arr[index2]) < 0){
                //Swap
                T val1 = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = val1;

                //decrement
                index1 -= 1;
                index2 -= 1;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"nathan", "apple", "classroom", "hat", "cat"};
        //MultiSort<String> ms = new MultiSort<>();
        //System.out.println(Arrays.toString(ms.insertionSort(strings)));
    }



}
