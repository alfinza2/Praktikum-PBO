package jobsheet1;

public class Speaker {
    private String merk;
    private int volume;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void ubahVolume(int newValue){
        volume = newValue;
    }
    
    public void tambahVolume(int increment){
        volume = volume + increment;
    }
    
    public void kurangVolume(int decrement){
        volume = volume - decrement;
    }
    
    public void cetak(){
        System.out.println("Merk         : " + merk);
        System.out.println("Volume Suara : " + volume);
    }
}

