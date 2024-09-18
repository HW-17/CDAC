/*Write a Java program to find the k largest elements in a given array. Elements in the array 
can be in any order (Use scanner class to input and Array, below picture is example do not 
make static array as repsrented in example). */

package test2;

import java.util.Arrays;
import java.util.Scanner;

public class program2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        System.out.println("Enter the largest search: ");
        int k = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array element ::");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Largest " + k + " elements ::");
        Arrays.sort(array);

        int KLargest = array.length - 1 - k;
        for (int i = array.length - 1; i > KLargest; i--) {
            System.out.println(array[i]);
        }
    }
}
