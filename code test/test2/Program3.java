/*Write a Java program to find the numbers greater than the average of the numbers of a 
given array (Use scanner class to input and Array, below picture is example do not make 
static array as repsrented in example). */
package test2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / n;
        System.out.println("Average of array elements is :" + avg);
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i] + " ");
            }
        }
        sc.close();
    }
}
