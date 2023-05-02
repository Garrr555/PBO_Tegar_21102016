package Pertemuan4;

public class Main016 {
    public static void main(String[] args){
        TimMPL mpl = new TimMPL();
        Onic sonic = new Onic();
        RRQ kingdom = new RRQ();

        mpl.juaraMPL016 = 4;
        mpl.nama016 = "RRQ dan ONIC";
        mpl.coachPH016 = "Arcadia dan YEB";
        mpl.showInfo016();

        System.out.println("\n");

        sonic.nama016 = "ONIC";
        sonic.juaraMPL016 = 4;
        sonic.konsistenupper016("Kairi");
        sonic.ekstrakonsistenupper016();
        sonic.konsistenupper016();

        System.out.println("\n");

        kingdom.nama016 = "RRQ";
        kingdom.juaraMPL016 = 4;
        kingdom.konsistenM016("Lemon");
        kingdom.ekstrakonsistenM016();
        kingdom.konsistenM016();

    }
}
