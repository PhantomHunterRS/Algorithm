package com.phantomhunter;

public class Main {
    public static void main(String[] args) {
            int [] array1 = new int [] {8,97,-34,5,9,10};
        //binarySearch
        System.out.println("Your number raid - " + binarySearch(array1,21));
        // find Min Max Numbers in array
        findMinMax(array1);
        //recursion
        countDown(10);
        System.out.println();
        // factorial
        System.out.println(factorial(4));
        System.out.println(summArrayRec(array1.length-1,array1));
        System.out.println(minArrayRec(array1.length-1,array1[0],array1));

    }
    private static int binarySearch(int [] array, int item){
        int low = 0;
        int high = array.length-1;
        int mid;
        int guess;
        while (low<=high){
            mid = (low+high)/2;
            guess = array[mid];
            if (guess == item) {
                return mid;
            }
            if (guess>item){
                high = mid - 1;
            }else {
                low = mid+1;
            }
        }return -1;
    }
    private static void findMinMax(int [] array){
        int indexMin = 0;
        int min = array[indexMin];
        int indexMax = 0;
        int max = array[indexMax];
        for (int i = 1; i < array.length ; i++) {
            if (min>array[i]){
                min = array[i];
                indexMin = i;
            }
            if (max<array[i]){
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("In array - Max Number = " + max+ " on position " +(indexMax+1) + " and Min Number = " + min+ " on position " + (indexMin+1));
    }
    private static int findMin(int [] array){
        int min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    private static void selectionSort(int [] array){
        int [] newArray = new int [array.length];
    }
    private static void countDown(int number){
        System.out.print(number);
        if(number == 0 ){
            return;
        }else {
            System.out.print("\t");
            countDown(number-1);
        }

    }
    private static int factorial(int number){
        if (number == 1){
            return 1;
        }else{
            return number*factorial(number-1);
        }
    }
    private static int summArrayRec(int lengthArray, int [] array){
        if (lengthArray == 0) {
            return array[lengthArray];
        } else { return array[lengthArray]+summArrayRec(lengthArray-1,array);}
        }
    private static int minArrayRec(int lengthArray, int min, int [] array){
        if (min>array[lengthArray]){
            min = array[lengthArray];
        }
        if (lengthArray == 0) {
            return min;
        } else {
            return minArrayRec(lengthArray-1,min,array);
        }
    }
    





}


