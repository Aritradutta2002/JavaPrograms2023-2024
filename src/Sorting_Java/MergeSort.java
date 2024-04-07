package Sorting_Java;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size;
        System.out.println("Enter the Arraylist Size: ");
        size = sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Before sorting : "+list);
        Collections.sort(list);
        System.out.println("After sorting the list: "+ list);
    }
}
