/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class SelectionSortController {
    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+i; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            if(minIndex!= i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public  int[] genRanArray(int n){
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(n);
        }
        return arr;
    }
}
