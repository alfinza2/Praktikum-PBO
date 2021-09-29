package jobsheet4;

public class TimNinja {
    private String namaTim;
    private Orang[] arrayOrang;

    public TimNinja() {
    }

    public TimNinja(String namaTim, int jumlah) {
        this.namaTim = namaTim;
        this.arrayOrang = new Orang[jumlah];
        this.initOrang();
    }
    
    public void setOrang(Orang orang){
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
        return namaTim;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaTim = namaTim;
    }

    public Orang[] getOrang() {
        return arrayOrang;
    }
    
    public String info(){
        String info = "";
        info += "=== Info Tim ===\n";
        info += "Nama Tim : " + this.namaTim + "\n";
        info += "Anggota tim : " + "\n";
        int i = 0;
        while (i < arrayOrang.length && arrayOrang[i].getNama() != null){
            info += arrayOrang[i].getNama();
            info += "\n";
            i++;
        }
        return info;
    }
}
