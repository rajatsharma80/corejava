package collections.array;

import java.util.Scanner;
/*
Get input from users and store in an Array.
Print the input.
Sort the Array and restore it in another Array.
Print the sorted Array.
 */
public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Enter the length of Array to be sorted: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] sortedArray = getIntegers(arrayLength);
        for(int i=0; i<sortedArray.length; i++){
            System.out.println("Number at " + i + " position is " + sortedArray[i]);
        }
    }
    public static int[] getIntegers(int arrayLength){
        Scanner scanner = new Scanner(System.in);
        int[] unsortedArray = new int[arrayLength];
        int num = 0;
        for(int i=0; i<arrayLength; i++){
            num = i+1;
            System.out.println("Enter " + num + " number: ");
            unsortedArray[i] = scanner.nextInt();
        }
        printArray(unsortedArray);
        return sortArray(unsortedArray);
    }
    public static void printArray(int[] unsortedArray){
        for(int i=0; i<unsortedArray.length; i++){
            System.out.println(i+1 + " number is " + unsortedArray[i]);
        }
    }
    public static int[] sortArray(int[] unsortedArray){
        int[] sortedArray = new int[unsortedArray.length];
        for(int i=0; i<unsortedArray.length; i++){
            sortedArray[i] = unsortedArray[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
