package jobsheet4;

public class Guru {
    private Orang[] arrayOrang;

    public Guru() {
    }

    public Guru(int jumlah) {
        this.arrayOrang = new Orang[jumlah];
        this.initOrang();
    }
    
    private void initOrang(){
        for (int i = 0; i < arrayOrang.length; i++){
            this.arrayOrang[i] = new Orang();
        }
    }
    
    public void setOrang(Orang orang){
        for(int i = 0; i < arrayOrang.length; i++){
            if(arrayOrang[i].getNama() == null){
                arrayOrang[i] = orang;
                break;
            }
        }
    }

    public Orang[] getArrayOrang() {
        return arrayOrang;
    }

    public void setArrayOrang(Orang[] arrayOrang) {
        this.arrayOrang = arrayOrang;
    }
    
    public String info(){
        String info = "";
        info += "=== Info Guru ===\n";
        int i = 0;
        while (i < arrayOrang.length && arrayOrang[i].getNama() != null){
            info += arrayOrang[i].getNama();
            info += "\n";
            i++;
        }
        return info;
    }
}