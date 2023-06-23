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
public class Algorithm_1920_030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("================ ((Algorithms))====================");
        System.out.println(" 1) Data Structures\n"
                + " 2) Graph Algorithms");
        System.out.print("Enter your choice here: ");
        int choice = s.nextInt();
        System.out.println("====================================================");

        if (choice == 1) {
            System.out.println("================ ((Data Structures))====================");
            System.out.println("  01) Bubble Sort\n"
                    + " 02)  Insertion Sort\n"
                    + " 03)  Selection Sort\n"
                    + " 04)  Marge Sort\n"
                    + " 05)  Quick Sort\n"
                    + " 06)  Counting Sort\n"
                    + " 07)  Radix Sort\n"
                    + " 08)  Heap Sort\n"
                    + " 09)  Bin Sort\n"
                    + " 10)  Shell Sort\n"
                    + " 11)  Linear Search\n"
                    + " 12)  Binary Search\n"
                    + " 13)  Euclidean GCD Algorithm\n"
                    + " 14)  Universal Hashing\n"
                    + " 15)  Stack\n"
                    + " 16)  Queue\n"
                    + " 17)  Linked List\n"
                    + " 18)  Fibonacci Numbers\n"
                    + " 19)  Recurrences");
            System.out.print("Enter your Data Sturcture choice here: ");
            int c1 = s.nextInt();
            switch (c1) {
                case 1:
                     BubbleSort b = new BubbleSort();
                     b.bubble_sort();
                    break;
                case 2:
                    InsertionSort insort =new InsertionSort();
                    insort.insertionSort();
                    
                    break;
                case 3:
                   
                     SelectionSort selection = new SelectionSort();
                     selection.selectionsort(); 
                    break;
                case 4:
                        
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("====================================================");
        } else if (choice == 2) {
            System.out.println("================ ((Algorithms))====================");
            System.out.println("  01) Largest Common Subsequence\n"
                    + " 02)  Optimal Binary Search Tree\n"
                    + " 03)  Matrix Chain Multiplication\n"
                    + " 04)  Strassen's Matrix Muliplication Algorithm\n"
                    + " 05)  BFS\n"
                    + " 06)  DFS\n"
                    + " 07)  DAG\n"
                    + " 08)  Longest Increasing Subsequence\n"
                    + " 09)  Topological Sort\n"
                    + " 10)  Krushkal's Algorithm\n"
                    + " 11)  Prim's Algorithm\n"
                    + " 12)  Dijkastra's Algorithm\n"
                    + " 13)  Bellman Ford's Algorithm\n"
                    + " 14)  Worshall's Algorithm\n"
                    + " 15)  (0,1) KKnapsack Problem\n"
                    + " 16)  Naive String Matching Algorithms\n"
                    + " 17)  Rabin Krap String Matching Algorithm\n"
                    + " 18)  Activity Selection Problem\n"
                    + " 19)  MST Algorithms\n"
                    + " 20)  Max Flow Min Cut");
            System.out.print("Enter your Graph Algorithm choice : ");
            int c1 = s.nextInt();
            switch (c1) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("====================================================");

        } else {
            System.out.println("Invalid choice");
        }
    }

}
