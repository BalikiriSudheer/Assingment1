package Com.Demo;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer");
        int n=sc.nextInt();
        if(n>10){
            int result=n+5;
            System.out.println(result);
        }
        else{
            System.out.println("is not greatter");
        }
    }
}
