package Nodo;
public class PruebasNodo {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();

        // Usamos los métodos de ListaLigada en vez de manipular nodos a mano
        lista.agregarAlFinal(50);
        lista.agregarAlFinal(25);
        lista.agregarAlFinal(17);
        lista.agregarAlFinal(3);

        System.out.println("Elementos en la lista enlazada:");
        lista.transversal();

        System.out.println("¿Está vacía la lista? " + lista.estaVacia());

        lista.agregarAlInicio(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregar(15, 1); // insertar en posición 1

        System.out.println("\nLista inicial:");
        lista.transversal();

        System.out.println("Tamaño: " + lista.getTamanio());
        System.out.println("¿Está vacía la lista? " + lista.estaVacia());

        lista.eliminar(15, 1); // eliminar en posición
        System.out.println("\nDespués de eliminar en posicion 1:");
        lista.transversal();

        lista.eliminarAlInicio();
        System.out.println("\nDespués de eliminar al inicio:");
        lista.transversal();

        lista.eliminarUltimo();
        System.out.println("\nDespués de eliminar al final:");
        lista.transversal();

        System.out.println("¿Está vacía la lista? " + lista.estaVacia());

        lista.agregarAlFinal(99);
        lista.actualizar(20, 200);
        System.out.println("\nDespués de actualizar:");
        lista.transversal();

        System.out.println("Buscar 200 está en posición: " + lista.buscar(200));
    }
}
