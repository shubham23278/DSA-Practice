import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        displayArr(arr, n);

    }

    public static void displayArr(int[] arr, int idx){
        for(int i=0; i<idx; i++) System.out.println(arr[i]);
    }

}