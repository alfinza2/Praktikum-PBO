package tugas3;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();
        
        encap.setName("James");
        encap.setAge(35);
        encap2.setName("Agus");
        encap2.setAge(10);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        System.out.println(" ");
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age  : " + encap2.getAge());
    }
}
