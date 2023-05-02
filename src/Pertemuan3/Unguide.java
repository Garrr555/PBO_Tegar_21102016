package Pertemuan3;

import java.util.Scanner;

public class Unguide {

    private String namapaket;
    private String benefit;
    private int biaya;

    public Unguide(String namapaket, String benefit, int biaya){
        this.namapaket = namapaket;
        this.benefit = benefit;
        this.biaya = biaya;
    }

    public void showinfo(){
        System.out.println("Nama Paket  :" + namapaket);
        System.out.println("Benefit     :" + benefit);
        System.out.println("Biaya paket :" + biaya);
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Unguide paket1 = new Unguide("Service Motor", "Performa kendaraan terjaga", 250000);
        Unguide paket2 = new Unguide("Ganti Oli", "Menjaga suhu dan komponen mesin", 150000);
        Unguide paket3 = new Unguide("Isi Nitrogen", "Menjaga suhu ban", 20000);

        int nopaket;

        do {

            System.out.println(" 1. Service Motor \n 2. Ganti Oli \n 3. Isi Nitrogen \n 4. Keluar");

            System.out.println("Masukan no paket : ");
            nopaket = input.nextInt();

            if (nopaket == 1) {
                paket1.showinfo();
            }
            else if (nopaket == 2) {
                paket2.showinfo();
            }
            else if (nopaket == 3) {
                paket3.showinfo();
            }
            else if (nopaket >= 4) {
                System.out.println("Anda telah Log out");
            }
            else {
            }
        }

        while(nopaket != 4);

    }
}
