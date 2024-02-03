package org.example;

import org.example.controllers.Myutilities;

public class Main {

    public static void main(String[] args) {
       int a = 1;

//       if(a >= 10 && a <= 15){
//           System.out.println("num greater than 10");
//       } else if (a > 15 || a == 25) {
//           System.out.println("a is 25");
//       }  else {
//           System.out.println("please enter num greater than 10 only");

//
//       }

//        switch (a){
//            case 5:
//                System.out.println("Grade is average");
//                break;
//            case 10:
//                System.out.println("Grade is above average");
//                break;
//            default:
//                System.out.println("no num provided");
//        }

//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + " is even");
//            }
//            else if (i % 3 == 0) {
//                System.out.println(i + " is odd");
//            }
//        }

        Object[] arr = {"7", "8", "dew","mcD", "kfc", 7, 3, true, 44.56};

        double sum = 0.0;
        for (Object arritems: arr) {
            if (arritems instanceof String){
                String str = (String)arritems;
                str = str.replaceAll("[a-zA-Z]", "");
                System.out.println("string val: "+ str);
                if(!str.isEmpty()){
                    int tempnum = Integer.parseInt(str);
                    sum = sum + (double) tempnum;
                }
            }
            else if(arritems instanceof Integer){
                sum = sum + (Integer)arritems;
            }
            else if(arritems instanceof Double){
                sum = sum + (Double) arritems;
            }
        }

        System.out.println("Total sum is: "+ sum);


//        String str = "a3fg#$h@9";
//        String onlynums = str.replaceAll("[a-zA-Z0-9]", "");
//
//        System.out.println(onlynums);

    }
}