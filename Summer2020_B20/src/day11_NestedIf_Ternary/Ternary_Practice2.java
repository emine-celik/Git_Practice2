package day11_NestedIf_Ternary;

public class Ternary_Practice2 {
    // ? means if, : else
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";

        }


   String result2 = (num > 0)? "Positive":(num < 0)?"Negative" : "Zero";

        System.out.println(result);

        System.out.println(result2);
        System.out.println("===================================");

          int a = 20000;
          int b =20000;
          String c ="";
          if(a>b){
              c = " a is greater";
          }else if(b>a){
              c= " b is greater";
          }else{
              c= "equal";
          }
        System.out.println(c);
        String c1 = (a>b)? " a is greater" :(b>a) ?"b is greater" : " a is equal to b";
        System.out.println(c1);

    }
}
