package Pertemuan4;

public class Manajer extends Pegawai{
    public void bonus(int bonus){
        System.out.println("Pegawai atas nama : "+nama+"("+nip+") mendapatkan bonus sebesar "+bonus);
    }

    public void ekstrainfo() {
        System.out.println("Jabatam Pegawai : Manajer");
    }

    public void bonus(){
        System.out.println("Error harap masukan nominal bonus !");
    }
}
