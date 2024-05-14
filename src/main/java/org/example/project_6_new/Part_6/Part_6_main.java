package org.example.project_6_new.Part_6;

import org.example.project_6_new.Part_4.Insertion;

import java.util.Random;

public class Part_6_main {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] arr = new Integer[10];

        System.out.println("Before sorting:");
        int i = 0;
        for (i = 0; i < 10; i++){
            arr[i] = rand.nextInt(100);
            System.out.println(arr[i]);
        }
        Merge.sort(arr);
        System.out.println("After sorting:");
        for (i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }
    }
}
