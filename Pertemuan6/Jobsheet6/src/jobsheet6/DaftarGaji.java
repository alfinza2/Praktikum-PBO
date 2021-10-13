package jobsheet6;

public class DaftarGaji {
    public Pegawai[] listPegawai;

    public DaftarGaji(int listPegawai) {
        this.listPegawai = new Pegawai[listPegawai];
        this.initPegawai();
    }
    
    public void initPegawai(){
        for(int i=0; i<this.listPegawai.length; i++)
            this.listPegawai[i] = new Pegawai(null,null,null);
    }
    
    public void addPegawai(Pegawai listPegawai){
        for(int i=0; i<this.listPegawai.length; i++){
            if(this.listPegawai[i].getNama()==null){
                this.listPegawai[i]=listPegawai;
                break;
            }
        }
    }
    
    public void printSemuaGaji(){
        for(int i=0; i<this.listPegawai.length; i++){
            if(this.listPegawai[i].getNama()!=null){
                System.out.println("Nama : " + listPegawai[i].getNama());
                System.out.println("Gaji : " + "Rp." + listPegawai[i].getGaji() 
                        + ",00");
                System.out.println("");
            }
        }
    }
}

