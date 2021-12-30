package binatang;

public class Main10 {

    public static void main(String[] args) {
        Singa singa = new Singa("Singa", 4, "Ngaum", "Kuning");
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
        System.out.println();

        Keledai keledai = new Keledai("Keledai", 4, "ngiok ngiok", "coklat");
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        System.out.println();

        Gorila gorila = new Gorila("Gorila", 2, "houh houh", "hitam");
        gorila.displayBinatang();
        gorila.displayMakan();
        gorila.displayData();
    }

}
