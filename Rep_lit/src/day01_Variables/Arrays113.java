package day01_Variables;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays113 {
    public static void main(String[] args) {

        String sentence ="Java is fun";
        String[] arr=sentence.split(" ");

        for(int i =arr.length-1;i >=0;i--){

            System.out.println(arr[i]);
        }



    }
}
