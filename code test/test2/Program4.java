/*Write a Java program to move every positive number to the right and every negative 
number to the left of a given array of integers (Use scanner class to input and Array, below 
picture is example do not make static array as repsrented in example) */
package test2;

import java.util.Scanner;
import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(" the sorted array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
