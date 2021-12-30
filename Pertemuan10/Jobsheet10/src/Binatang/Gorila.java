package binatang;

public class Gorila extends Binatang implements IHerbivora, IKarnivora {

    private String suara, warnaBulu;

    public Gorila(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Hewan ini Adalah " + super.getNama());
        System.out.println("Kakinya ada " + super.getKaki());
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan mereka adalah Daging dan Tumbuhan");
    }

    public void displayData() {
        System.out.println("Suaranya '" + this.suara + "'");
        System.out.println("Bulu mereka berwarna " + this.warnaBulu);
    }
}
