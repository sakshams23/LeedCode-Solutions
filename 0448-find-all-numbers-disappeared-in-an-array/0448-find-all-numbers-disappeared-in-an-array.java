//package com.saksham;

//import java.util.ArrayList;
//import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = (arr[i]-1);
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != (index + 1)) {
                result.add(index + 1);
                
            }
            
            
        }

        return result;
    }


    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
