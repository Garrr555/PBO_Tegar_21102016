package com.Tegar.PBO.Pertemuan2;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Looping For
        for (int i = 0; i < 10; i++) {
            System.out.println("Looping...(" + i + ")");
        }
        System.out.println("Looping for selesai !");

        //Looping For menggunakan Inputan
        System.out.println("Masukan bilangan awal : ");
        int bilanganawal = input.nextInt();

        System.out.println("Masukan bilangan akhir : ");
        int bilanganakhir = input.nextInt();

        for (int i = bilanganawal; i < bilanganakhir; i++) {
            System.out.println("Looping...(" + i + ")");
        }
        System.out.println("Looping for selesai !");

        //Looping While
        int j = 0;
        while (j <= 20) {
            System.out.println("Looping...(" + j + ")");
            j += 5;
        }
        System.out.println("Looping for selesai !");

        //Looping While menggunakan Inputan
        System.out.println("Masukan beda bilangan : ");
        int beda = input.nextInt();

        int a = bilanganawal;
        while (a <= bilanganakhir) {
            System.out.println("Looping...(" + a + ")");
            a += beda;}
        System.out.println("Looping for selesai !");

            //Looping do while
            int k = 10;
            do {
                System.out.println("Looping...(" + k + ")");
                k--;
            }

            while (k > 0);
            System.out.println("Looping for selesai !");
        }
    }
