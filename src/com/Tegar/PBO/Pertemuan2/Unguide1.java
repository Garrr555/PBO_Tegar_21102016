package com.Tegar.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguide1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Username : ");
                String user =input.nextLine();

        System.out.println("Masukan Password : ");
                String pass =input.nextLine();

        if(user.equals("babi") || user.equals("Babi")){

            if(pass.equals("ari")){
                System.out.println(" Login berhasil silahkan masuk ");
            }

            else{
                System.out.println("Silakan login dengan username dan password yang sah!");
            }
        }

        else if(pass.equals("ari")) {
            if (user.equals("babi") || user.equals("Babi")) {
                System.out.println(" Login berhasil silahkan masuk ");
            } else {
                System.out.println("Silakan login dengan username dan password yang sah!");
            }
        }
            else{
            System.out.println("Username dan password Anda salah");
        }

        }

    }

