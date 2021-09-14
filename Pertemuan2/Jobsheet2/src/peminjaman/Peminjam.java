package peminjaman;

public class Peminjam {
    public int id;
    public int harga;
    public int sewa;
    public String nama;
    public String namaGame;
    
    public void tampilData(){
        int hargaTotal = harga * sewa;
        System.out.println("=== Data Peminjaman ===");
        System.out.println("Id              : " + id);
        System.out.println("Nama            : " + nama);
        System.out.println("Nama video game : " + namaGame);
        System.out.println("Harga           : " + harga);
        System.out.println("Lama sewa       : " + sewa + "hari");
        System.out.println("Harga total     : " + hargaTotal);
    }
}

