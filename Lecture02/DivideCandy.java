package Lecture02;

import java.util.Scanner;

public class DivideCandy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if ((a>=0)&&(a<=10000)){
            if(a!=2){
                if(a%2==0) {
                    System.out.println("YES");
                } else System.out.println("NO");
            } else System.out.println("NO");
        }
    }
}
