package jobsheet6;

public class Main {
    public static void main(String[] args) {
        Pegawai pgw = new Pegawai("0419", "Alfin", "Malang");
        
        Dosen dos = new Dosen("0919", "Arya", "Balikpapam");
        dos.setSKS(4);
        
        DaftarGaji dg = new DaftarGaji(4);
        dg.addPegawai(pgw);
        dg.addPegawai(dos);
        dg.printSemuaGaji();
    }
}

