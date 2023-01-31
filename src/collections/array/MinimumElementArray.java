package collections.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of Elements you would like to insert in an Array: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] rawArray = readIntegers(count);
        System.out.println("Array consist of following elements: " + Arrays.toString(rawArray));
        int minElement = findMin(rawArray);
        System.out.println("The minimum element in the Array is: " + minElement);
    }
    public static int[] readIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int[] rawArray = new int[count];
        int num = 0;
        for(int i=0; i<count; i++){
            num = i+1;
            System.out.println("Enter " + num + " number: ");
            rawArray[i] = scanner.nextInt();
        }
        return rawArray;
    }
    public static int findMin(int[] array){
        int minElement = Integer.MAX_VALUE;
        for(int i = 0; i<array.length-1; i++){      //3, 2, 1, 5, 4
            if(array[i] < minElement){// 3 < 2, 2 < 1,
                minElement = array[i]; // 2, 2
            }
        }
        return minElement;
    }
}
