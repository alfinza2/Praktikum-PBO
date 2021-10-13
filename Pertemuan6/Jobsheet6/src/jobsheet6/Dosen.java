package jobsheet6;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int tarifSKS = 500000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    public void setSKS(int sks){
        this.jumlahSKS=sks;
    }
    
    @Override
    public int getGaji(){
        int gaji = jumlahSKS*tarifSKS;
        return super.getGaji()+gaji;
    }
}

