package day23_Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] arr = {5,5,4,3,4,1};
        int max = arr[0];
        int min = arr[0];

        for(int i =1; i <= arr.length-1; i++){

            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min =arr[i];


            }
        }
        System.out.println("Maxnumber number is: "+max);
        System.out.println("Minumum number is: "+min);








    }
}
