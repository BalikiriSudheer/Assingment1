package Com.Demo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer");
        int n=sc.nextInt();
        if(n>0){
            int res=n+10;
            System.out.println("positive number");
            System.out.println("positive number "+res);
        }
        else{
            System.out.println("is not positive number");
        }

    }}
