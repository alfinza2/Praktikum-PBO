package lingkaran;

public class Demo {
    
    public static void main(String[] args) {
        
        Lingkaran lk = new Lingkaran();
        
        System.out.println("===Menghitung Luas dan Keliling Lingkaran===");
        lk.phi = 3.14;
        lk.r = 16;
        System.out.println("Phi : " + lk.phi);
        System.out.println("r   : " + lk.r);
        lk.hitungLuas();
        lk.hitungKeliling();
    }
}

