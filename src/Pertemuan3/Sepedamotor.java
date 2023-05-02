package Pertemuan3;

public class Sepedamotor {
    private String merk;
    private String tipe;
    private int harga;

    //constructor
    public Sepedamotor(){}

    //constructor berparameter
    public Sepedamotor(String merk, String tipe, int harga ){
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    //method getter and setter
    public String getMerk() {

        return merk;
    }

    public void setMerk(String merk) {

        this.merk = merk;
    }

    public String getTipe() {

        return tipe;
    }

    public void setTipe(String tipe) {

        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void showInfo(){
        System.out.println("Merk motor adalah :" + merk);
        System.out.println("Tipe motor adalah :" + tipe);
        System.out.println("Harga motor yaitu :" + harga);
        System.out.println();
    }
}
