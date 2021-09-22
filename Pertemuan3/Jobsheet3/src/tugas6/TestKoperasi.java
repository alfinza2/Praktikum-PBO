package tugas6;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner alfin = new Scanner(System.in);
        int jumlah = 0;
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.print("\nMeminjam uang : ");
        donny.pinjam(alfin.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("\nMeminjam uang : ");
        donny.pinjam(alfin.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("\nMembayar angsuran : ");
        donny.angsur(alfin.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("\nMembayar angsuran : ");
        donny.angsur(alfin.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
