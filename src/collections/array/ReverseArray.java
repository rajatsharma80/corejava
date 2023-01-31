package collections.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter the count of numbers you want to Enter: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        System.out.println("Enter the numbers: ");
        for(int i=0; i<count; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Following is the non-reversed list of arrays: " + Arrays.toString(array));
        System.out.println("Array Length: " + array.length);
        reverse(array);
    }
    public static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        int j = 0;
        for(int i=array.length-1; i>=0; i--){
            reverseArray[j]=array[i];
            j++;
        }
        System.out.println("Reverse Array: " + Arrays.toString(reverseArray));
    }
}
