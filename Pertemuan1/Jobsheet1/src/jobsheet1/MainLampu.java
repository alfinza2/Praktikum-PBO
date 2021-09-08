package jobsheet1;

public class MainLampu {

    public static void main(String[] args) {

        Lampu lp = new Lampu();
        LampuPintar lpp = new LampuPintar();
        Laptop lpt = new Laptop();
        Speaker spk = new Speaker();

        lp.setMerk("Philips");
        lp.setJenis("LED");
        lp.ubahWatt(13);
        lp.tambahWatt(5);
        lp.kurangWatt(8);
        lp.cetak();
        System.out.println("");
        
        lpp.setMerk("Nanoleaf");
        lpp.setJenis("RGB Led");
        lpp.ubahWatt(5);
        lpp.setWarna("merah");
        lpp.cetak();
        System.out.println("");
        
        lpt.setMerk("MSI");
        lpt.setProsesor("Intel i5");
        lpt.ubahRam(4);
        lpt.tambahRam(4);
        lpt.ubahLayar(15 );
        lpt.cetak();
        System.out.println("");
        
        spk.setMerk("Acer");
        spk.ubahVolume(80);
        spk.kurangVolume(50);
        spk.tambahVolume(20);
        spk.cetak();
    }
}


