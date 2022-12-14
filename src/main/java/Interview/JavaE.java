package Interview;

import java.util.Arrays;

public class JavaE {
    public static void main(String[] args) {

        // impicit type casting
        // they will change value automatically short to long

//        short a=10;
//        int b;
//        b=a;
//        float f1=a;
//        System.out.println(b);
//        // explicit type casting // manual long to short change
//        int  a1=10;
//        float c= 1124.6789f;
//        int d= (int)a;
//        double e=(double)a;
//         double f=(int)a;
//
//       // float c=(float)a;
//        System.out.println(b);
        // set print the value after demical use String.format
        double d=135.5693045;
        System.out.println(
                String.format("%.2f", d));
        System.out.println(
                String.format("|%-20.2f|", 12345.2345));
        String str1=String.format("%d",101);
        String str2=String.format("|%20d|",102);
        String str3=String.format("|%-20d|",101);
        String str4=String.format("|%-20s|","raj");
        System.out.println(str4);

        System.out.println(str3);
        System.out.println(str2);

        System.out.println(str1);

//        float f=1224.f;
//        System.out.println(String.format("%.0f",f));
//        int[]arr={1,2,4,6,6};
//        System.out.println(arr.length);
//        System.out.println(Arrays.asList(arr));
//        Arrays.sort(arr);
//        int key=6;
//        System.out.println( key + " found at index = "+Arrays.binarySearch(arr,key));
//        String s="rajdharsingh";
//        System.out.println(s.length());

    }
}
