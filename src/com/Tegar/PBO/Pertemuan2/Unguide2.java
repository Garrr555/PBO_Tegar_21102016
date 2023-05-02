package com.Tegar.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguide2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama = "Tegar";

        System.out.println("Masukan Gaji : ");
        int gaji =input.nextInt();

        System.out.println("Masukan Tunjangan : ");
        int tunjang =input.nextInt();

        System.out.println("Masukan Pajak : ");
        double pajak =input.nextDouble();

        double pajakbaru = pajak / 100;

        System.out.println("Gaji           : " + gaji);
        System.out.println("Tunjangan      : " + tunjang);
        System.out.println("Pajak          : " + pajak +"% \n");

        int gaji_kotor = gaji + tunjang;
        double pajak_negara = gaji_kotor * pajakbaru;
        double gaji_bersih = gaji_kotor - pajak_negara;

        System.out.println("Gaji Kotor   : "+gaji_kotor);
        System.out.println("Pajak Negara : "+pajak_negara);
        System.out.println("Gaji Bersih  : "+gaji_bersih+"\n");

        System.out.println("Total gaji bersih dari "+ nama +" yang diterima yaitu "+ gaji_bersih);
    }
}
