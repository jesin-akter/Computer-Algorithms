/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;

/**
 *
 * @author CSE11
 */
public class BubbleSort {

    public void bubble_sort() {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size => ");
        int n = s.nextInt();

        int[] list = new int[n];

        System.out.print("Enter array value => ");
        for (int i = 0; i < n; i++) {
            System.out.print(" Index {" + i + "} = ");
            list[i] = s.nextInt();
        }

        System.out.print("Element before sorting => ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + list[i]);
        }

        System.out.println(" ");

        // bubble sort
        int temp;

        for (int i = 0; i < n; i++) {

            System.out.println("Pass : " + i);

            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                for (int k = 0; k < n; k++) {
                    System.out.print(list[k] + " ");
                }
                System.out.println("");

            }

            System.out.println("");

        }

        System.out.println("");

        System.out.print("Element after sorting => ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + list[i]);
        }

    }
}
