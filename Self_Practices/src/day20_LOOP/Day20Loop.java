package day20_LOOP;

public class Day20Loop {
    public static void main(String[] args) {

        for(int i = 1; i <= 100;i++){
            if( i %3==0 && i %5 !=0) {
                System.out.print(i + " ");
            }
        }

        for(int i =0; i <=100;i++){
            if(i% 2 == 0 )
            System.out.print(i+" ");
        }




    }
}
