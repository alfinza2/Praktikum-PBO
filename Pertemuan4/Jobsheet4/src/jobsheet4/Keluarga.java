package jobsheet4;

public class Keluarga {
    private String namaKeluarga;
    private Orang[] arrayOrang;
    private Guru orangTua;

    public Keluarga() {
    }

    public Keluarga(String namaKeluarga, int jumlah) {
        this.namaKeluarga = namaKeluarga;
        this.arrayOrang = new Orang[jumlah];
        this.initOrang();
    }
    
    public void setAnak(Orang orang){
        for(int i = 0; i < arrayOrang.length; i++){
            if(arrayOrang[i].getNama() == null){
                arrayOrang[i] = orang;
                break;
            }
        }
    }
    
    private void initOrang(){
        for (int i = 0; i < arrayOrang.length; i++){
            this.arrayOrang[i] = new Orang();
        }
    }
    
    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaKeluarga = namaKeluarga;
    }

    public Orang[] getOrang() {
        return arrayOrang;
    }

    public Guru getOrangTua() {
        return orangTua;
    }

    public void setOrangTua(Guru orangTua) {
        this.orangTua = orangTua;
    }
    
    public String info(){
        String info = "";
        info += "=== Info Keluarga ===\n";
        info += "Nama Keluarga : " + this.namaKeluarga + "\n";
        int i = 0;
        while (i < arrayOrang.length && arrayOrang[i].getNama() != null){
            info += arrayOrang[i].info();
            info += "\n";
            i++;
        }
        return info;
    }
}
