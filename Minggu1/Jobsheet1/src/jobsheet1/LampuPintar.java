package jobsheet1;

public class LampuPintar extends Lampu {

    private String warna;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setWarna() {
        super.cetak();
        System.out.println("Warna : " + warna);
    }
}


