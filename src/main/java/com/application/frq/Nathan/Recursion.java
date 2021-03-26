package com.application.frq.Nathan;

import java.util.Arrays;
import java.util.List;

public class Recursion {

    public static int[] mergeSort(int[] vals){

        if(vals.length == 1){ // Terminating Case
            return vals;
        }

        int half = vals.length/2;
        int[][] splits = split(vals, half);
        int[] arr1 = splits[0];
        int[] arr2 = splits[1];

        return merge(mergeSort(arr1), mergeSort(arr2));
    }

    //helper method
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];
        int rI = 0;
        int i1 = 0;
        int i2 = 0;

        //{1,2}, new int[]{5,6}

        while (i1<arr1.length && i2<arr2.length){
            if(arr1[i1] < arr2[i2]){
                result[rI] = arr1[i1];
                i1++;
            }else {
                result[rI] = arr2[i2];
                i2++;
            }
            rI++;
        }

        // copy extra 😡
        while (i1 < arr1.length){
            result[rI] = arr1[i1];
            i1++;
            rI++;
        }

        while (i2 < arr2.length){
            result[rI] = arr2[i2];
            i2++;
            rI++;
        }

        return result;
    }

    public static int[][] split(int arr[], int i){
        int[] arr1 = new int[i];
        int[] arr2 = new int[arr.length - i];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        System.arraycopy(arr, arr1.length, arr2, 0, arr2.length);
        return new int[][]{arr1, arr2};
    }

    public static void main(String[] args) {
       int[] vals = new int[]{5,2,8,23,6,7,123,-1,435,2,7,2,7,8,90};

       System.out.println(Arrays.toString(Recursion.mergeSort(vals)));
       //System.out.println(Arrays.toString(Recursion.merge(new int[]{1,5}, new int[]{2,6})));

       //System.out.println(Arrays.toString(Recursion.merge(vals, vals)));
       //System.out.println(Arrays.deepToString(Recursion.split(vals, vals.length/2)));
    }

}
