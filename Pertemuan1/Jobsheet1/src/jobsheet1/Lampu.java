package jobsheet1;

public class Lampu {

    private int watt;
    private String jenis;
    private String merk;

    public void ubahWatt(int newValue) {
        watt = newValue;
    }

    public void tambahWatt(int increment) {
        watt = watt + increment;
    }
    
    public void kurangWatt(int decrement){
        watt = watt - decrement;
    }
    
    public void setJenis(String newValue){
        jenis = newValue;
    }
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void cetak(){
        System.out.println("Merk  : " + merk);
        System.out.println("Jenis : " + jenis);
        System.out.println("Watt  : " + watt);
    }
}


