package Lista;
public class PruebasSet2 {
    public static void main(String[] args) {
        SetADT<Integer> conjunto2= new SetADT<>();
        conjunto2.agregar(4);
        conjunto2.agregar(5);
        conjunto2.agregar(2);
        conjunto2.agregar(2);
        conjunto2.agregar(23);
        conjunto2.agregar(25);
        conjunto2.agregar(22);
        conjunto2.agregar(26);
        conjunto2.agregar(11);
        conjunto2.agregar(28);
        conjunto2.agregar(22);
        System.out.println(conjunto2);
    }
}
