package Pertemuan3;

public class Main {
    public static void main(String[] args){

        Sepedamotor honda = new Sepedamotor( "Honda",  "Vario 160", 30000000);
        Sepedamotor yamaha = new Sepedamotor( "Yamaha",  "Nmax", 60000000);
        Sepedamotor vespa = new Sepedamotor( "Vespa",  "Vespa", 65000000);


    /*
        //mengisi atribut dari object honda
        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 30000000;

        //mengisi atribut object yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "Nmax";
        yamaha.harga = 60000000;

        //mengisi atribut object vespa
        vespa.merk = "Vespa";
        vespa.tipe = "Vespa";
        vespa.harga = 65000000;
    */


        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();



        //uji coba getter & setter
        System.out.println("uji coba getter & setter");
        System.out.println("motor merek " + honda.getMerk() + " dengan tipe(before) :" + honda.getTipe());

        honda.setTipe("Yamaha 125");
        honda.setMerk("halo");
        System.out.println("Motor merek " + honda.getMerk() + " dengan tipe(after)  : " + honda.getTipe());

    }
}
