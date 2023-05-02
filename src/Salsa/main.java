package Salsa;

public class main{
    public static void main(String[] args) {
        buku book = new buku();
        fiksi fix = new fiksi();
        nonfiksi non = new nonfiksi();

        book.fungsi = "Sebagai Sumber Informasi";
        book.harga = 50000;
        book.pendidikan();

        System.out.println("\n");

        fix.benarjumlah("relatif", 500);
        fix.ekstrabenarjumlah();
        fix.benarjumlah();

        System.out.println("\n");

        non.gayajumlah("Formal", 300);
        non.ekstragayajumlah();
        non.gayajumlah();
    }
}
