package Salsa;

public class nonfiksi extends buku{
    public void gayajumlah(String gaya, int jumlah){
        System.out.println("Buku fiksi dengan jumlah halaman "+jumlah+" memiliki gaya bahasa yang "+gaya);
    }

    public void ekstragayajumlah(){
        System.out.println("Buku non Fiksi itu memberikan ide-ide baru");
    }

    public void gayajumlah(){
        System.out.println("Harap masukan gaya bahasa dari buku tersebut");
    }
}
