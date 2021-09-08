package jobsheet1;

public class Laptop {
    private String merk;
    private String prosesor;
    private int ram;
    private int lebarLayar;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void setProsesor(String newValue){
        prosesor = newValue;
    }
    
    public void ubahRam(int newValue){
        ram = newValue;
    }
    
    public void tambahRam(int increment){
        ram = ram + increment;
    }
    
    public void kurangRam(int decrement){
        ram = ram - decrement;
    }
    
    public void ubahLayar(int newValue){
        lebarLayar = newValue;
    }
    
    public void tambahLayar(int increment){
        lebarLayar = lebarLayar + increment;
    }
    
    public void kurangLayar(int decrement){
        lebarLayar = lebarLayar - decrement;
    }
    
    public void cetak(){
        System.out.println("Merk        : " + merk);
        System.out.println("Prosesor    : " + prosesor);
        System.out.println("Ram         : " + ram);
        System.out.println("Lebar Layar : " + lebarLayar + " inch");
    }
}


