package frontend;

import backend.*;

public class TestBackend {

    public static void main(String[] args) {
        /*Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        // test delete
        kat3.delete();
        // test select all
        for (Kategori k : new Kategori().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        // test search
        for (Kategori k : new Kategori().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }*/
        
        Kategori novel = new Kategori().getById(15);
        Kategori referensi = new Kategori().getById(16);
        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        // test insert
        buku1.save();
        buku2.save();
        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();
        // test delete
        buku3.delete();
        // test select all
        for (Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for (Buku b : new Buku().search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        
        /*Anggota agt1 = new Anggota("Jud", "Mulyodadi", "08675555xxxx");
        Anggota agt2 = new Anggota("Mukhtar", "Mulyodadi", "08674444xxxx");
        Anggota agt3 = new Anggota("Amal", "Sumbersekar", "08673333xxxx");
        // test insert
        agt1.save();
        agt2.save();
        agt3.save();
        // test update
        agt2.setAlamat("Mulyoagung");
        agt2.save();
        // test delete
        agt3.delete();
        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+", Telepon: "+a.getTelepon());
        }
        // test search
        for (Anggota a : new Anggota().search("Mulyoagung")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+", Telepon: "+a.getTelepon());
        }*/
        
        /*Buku novel = new Buku().getById(7);
        Buku referensi = new Buku().getById(8);
        Anggota jud=new Anggota().getById(8);
        Anggota mukhtar=new Anggota().getById(9);
        Peminjaman pmj1 = new Peminjaman(jud,novel, "2021/11/24", "2021/11/26");
        Peminjaman pmj2 = new Peminjaman(mukhtar,referensi, "2021/11/25", "2021/11/26");
        Peminjaman pmj3 = new Peminjaman(mukhtar,novel, "2021/11/25", "2021/11/26");
        // test insert
        pmj1.save();
        pmj2.save();
        pmj3.save();
        // test update
        pmj2.setTanggalkembali("2021/11/27");
        pmj2.save();
        // test delete
        pmj3.delete();
        // test select all
        for (Peminjaman p : new Peminjaman().getAll()) {
            System.out.println("Anggota: " + p.getAnggota().getNama() + ", Judul buku: " + p.getBuku().getJudul()
                    +", Tanggal Pinjam: "+p.getTanggalpinjam()+", Tanggal Kembali: "+ p.getTanggalkembali());
        }
        // test search
        for (Peminjaman p : new Peminjaman().search("mukhtar")) {
            System.out.println("Anggota: " + p.getAnggota().getNama() + ", Judul buku: " + p.getBuku().getJudul()
                    +", Tanggal Pinjam: "+p.getTanggalpinjam()+", Tanggal Kembali: "+ p.getTanggalkembali());
        }*/
    }
}
