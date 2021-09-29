package jobsheet4;

public class Main {
    public static void main(String[] args) {
        Orang o1 = new Orang("Naruto", "Uzumaki", 30);
        Orang o2 = new Orang("Hinata", "Hyuga", 30);
        Orang o3 = new Orang("Boruto", "Uzumaki", 10);
        Orang o4 = new Orang("Himawari", "Uzumaki", 6);
        Orang o5 = new Orang("Sakura", "Uciha", 10);
        Orang o6 = new Orang("Mitsuki", "-", 10);
        Orang o7 = new Orang("Konohamaru", "Sarutobi", 10);
        Orang o8 = new Orang("Sasuke", "Uciha", 30);
        
        Guru gr = new Guru(2);
        gr.setOrang(o7);
        gr.setOrang(o8);
        System.out.println(gr.info());
        
        Keluarga k = new Keluarga("Uzumaki", 4);
        k.setAnak(o1);
        k.setAnak(o2);
        k.setAnak(o3);
        k.setAnak(o4);
        System.out.println(k.info());
        
        TimNinja tn = new TimNinja("Tim Tujuh", 3);
        tn.setOrang(o3);
        tn.setOrang(o5);
        tn.setOrang(o6);
        System.out.println(tn.info());
    }
}
