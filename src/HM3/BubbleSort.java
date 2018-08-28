package HM3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] ar  = new int [10];
        System.out.println("введи на консоле 10 чисел массива");
        for (int i = 0; i < 10; i++) {
            ar [i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("введенный массив - " + Arrays.toString(ar));
        System.out.println("отсортированный массив - " + Arrays.toString(sort(ar)));

    }

    public static int[] sort (int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        return arr;
    }


}
