package Controller;



import java.util.Arrays;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class InputOut {

    public int validateNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {// cac cau lenh chay thu 
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Input couldn't be empty");
                }
                int ouput = Integer.parseInt(input);
                if (ouput < 1) {
                    System.err.println("Number must larger than zero!!!");
                } else {
                    return ouput;
                }
            } //bat loi o catch 
            catch (NumberFormatException e) {
                System.err.println("You must enter a number");
            }
        }
    }

    public void Menu() {
        SelectionSortController BC = new SelectionSortController();
        System.out.println("Enter a number of array:");
        int n = validateNumber();
        int[] arr = BC.genRanArray(n);
        System.out.print("Unsorted array: " + Arrays.toString(arr) + "\n");
        BC.selectionSort(arr);
        System.out.print("Sorted array: " + Arrays.toString(arr) + "\n");
    }

   
}
