package Barang;

public class Demo {
    
    public static void main(String[] args) {
        
        Barang br = new Barang();
        
        br.kode = "D123";
        br.namaBarang = "Asus VivoBook";
        br.hargaDasar = 100000;
        br.diskon = (float) 0.1;
        br.tampilData();
    }
}

