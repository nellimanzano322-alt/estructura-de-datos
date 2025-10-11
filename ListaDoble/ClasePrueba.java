package ListaDoble;

public class ClasePrueba {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> lista = new DoubleLinkedList<>();
        lista.agregarAlInicio(1);
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(3);
        lista.agregarAlFinal(4);
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(6);
        System.out.println("Transversal de izquierda a derecha:");
        lista.transversal(1);   
        System.out.println("\nEsta vacia?: " + lista.estaVacia());
        System.out.println("Tamaño: " + lista.getTamanio());
        System.out.println("Eliminar inicio y final:");
        lista.eliminarInicio();
        lista.eliminaralfinal();
        lista.transversal(1);
        System.out.println("\nAgregar al inicio y final:");
        lista.agregarAlFinal(7);
        lista.agregarAlInicio(8);
        System.out.println("Transversal de derecha a izquierda:");
        lista.transversal(2);
        System.out.println("\nAgregando y eliminando en posiciones específicas:");
        lista.eliminar(4, 2);
        lista.agregar(9, 1);
        System.out.println("Transversal de izquierda a derecha:");
        lista.transversal(1);
        System.out.println("\nActualizar:");
        lista.actualizar(9, 10);
        lista.transversal(2);
        System.out.println("\nBuscar:");
        int posicion = lista.buscar(10);    
        System.out.println("El valor 10 se encuentra en la posicion: " + posicion);
}}
