package Barang;

public class Barang {
    int hargaDasar;
    float diskon;
    String kode;
    String namaBarang;
    
    public void hitungHargaJual(){
        int hargaJual = (int)(hargaDasar - (diskon * hargaDasar));
        System.out.println("Harga Jual : " + hargaJual);
    }
    
    public void tampilData(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : " + hargaDasar);
        System.out.println("Diskon : " + (int)(diskon * 100) + "%");
        hitungHargaJual();
    }
}

