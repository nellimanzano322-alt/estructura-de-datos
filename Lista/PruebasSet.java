package Lista;

public class PruebasSet {
    public static void main(String[] args) {
        SetADT<Integer> conjunto = new SetADT<>();
        conjunto.agregar(2);
        conjunto.agregar(2);
        conjunto.agregar(2);
        conjunto.agregar(2);
        conjunto.agregar(23);
        conjunto.agregar(24);
        conjunto.agregar(22);
        conjunto.agregar(22);
        conjunto.agregar(11);
        conjunto.agregar(11);
        conjunto.agregar(22);
        System.out.println(conjunto);
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
        SetADT<Integer> conjunto3= new SetADT<>();
        conjunto3.agregar(4);
        conjunto3.agregar(5);
        conjunto3.agregar(2);
         System.out.println(conjunto3);
        System.out.println("Longitud del conjunto 1: " + conjunto.longitud());
        System.out.println("Longitud del conjunto 2: " + conjunto2.longitud());
        System.out.println("ambos conjuntos son iguales? " + conjunto.equals(conjunto2));
        System.out.println("El conjunto 1 contiene el elemento 11? " + conjunto.contiene(11));
        System.out.println("El conjunto 2 contiene el elemento 11? " + conjunto2.contiene(11));
        conjunto.eliminar(11);
        System.out.println(conjunto);
        conjunto2.eliminar(18);
        System.out.println(conjunto2);
        System.out.println("El conjunto 1 es subconjunto del conjunto 2? " + conjunto.esSubconjunto(conjunto2));
        System.out.println("El conjunto 3 es subconjunto del conjunto 1? " + conjunto3.esSubconjunto(conjunto));
        System.out.println("El conjunto 3 es subconjunto del conjunto 2? " + conjunto3.esSubconjunto(conjunto2));
        conjunto.union(conjunto3);
        System.out.println("Union del conjunto 1 con el conjunto 3: \n" + //
                "" + conjunto);
        conjunto2.interseccion(conjunto3);
        System.out.println("Interseccion del conjunto 2 con el conjunto 3: \n" + //
                "" + conjunto2);
        conjunto.diferencia(conjunto3);
        System.out.println("Diferencia del conjunto 1 con el conjunto 3: \n" + //
                "" + conjunto);
    
    }
} 
    

