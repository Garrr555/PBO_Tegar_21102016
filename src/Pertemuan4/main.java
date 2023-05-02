package Pertemuan4;

public class main {
    public static void main(String[] args){
        Manajer manajerkami = new Manajer();
        Pegawai pegawaikami = new Pegawai();

        manajerkami.nip = 198067857;
        manajerkami.nama = "Hasan Sadikin";

        pegawaikami.nip = 198067998;
        pegawaikami.nama = "Asep Hutama";

        manajerkami.showinfo();
        manajerkami.bonus(1200000);
        manajerkami.bonus();
        manajerkami.ekstrainfo();

        System.out.println("\n");

        pegawaikami.showinfo();
    }
}
