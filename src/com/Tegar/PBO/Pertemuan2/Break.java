package com.Tegar.PBO.Pertemuan2;

import java.util.Scanner;

public class Break {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int p=0;
        while(p<= 100){
            System.out.println("Looping...(" + p + ")");
            p+=10;

            if(p==60){
                System.out.println("Udahlah Bro! makasih");
                break;
            }
        }
    }
}
