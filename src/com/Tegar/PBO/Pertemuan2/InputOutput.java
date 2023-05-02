package com.Tegar.PBO.Pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama anda : ");
        String nama = input.nextLine();

        System.out.println("Masukan usia anda : ");
        int usia = input.nextInt();

        System.out.println("Masukan Tinggi anda : ");
        double tinggi = input.nextDouble();

        System.out.println("Nama saya "+ nama + ", saya berusia " + usia +" tahun dengan tinggi " + tinggi);
    }
}
