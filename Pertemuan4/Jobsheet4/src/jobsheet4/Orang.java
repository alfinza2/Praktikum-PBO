
package jobsheet4;

public class Orang {
    private String nama;
    private String klan;
    private int umur;

    public Orang() {
    }
    
    public Orang(String nama, String klan, int umur){
        this.nama = nama;
        this.klan = klan;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKlan() {
        return klan;
    }

    public void setKlan(String klan) {
        this.klan = klan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String info(){
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Klan : " + this.klan + "\n";
        info += "Umur : " + this.umur + "\n";
        return info;
    }
}

