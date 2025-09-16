package Nodo;

public class ListaLigada<T> {
    private Nodo<T> head;
    private int tamanio = 0;

    public ListaLigada() {}

    public boolean estaVacia(){
        return head == null;
    }

    public int getTamanio(){
        return this.tamanio;
    }

    public boolean eliminar(T valor, int posicion){
        if(this.head == null || posicion < 0 || posicion >= this.tamanio){
            return false;
        }
        if(posicion == 0){
            this.head = this.head.getSiguiente();
            this.tamanio--;
            return true;
        }
        Nodo<T> currNode = this.head;
        for (int i = 0; i < posicion - 1; i++) {
            currNode = currNode.getSiguiente();
        }
        if(currNode.getSiguiente() == null){
            return false;
        }
        currNode.setSiguiente(currNode.getSiguiente().getSiguiente());
        this.tamanio--;
        return true;
    }  

    public boolean eliminarAlInicio(){
        if(this.head == null){
            return false;
        }
        this.head = this.head.getSiguiente();
        this.tamanio--;
        return true;
    }

    public boolean eliminarUltimo(){
        if(this.head == null){
            return false;
        }
        if(this.head.getSiguiente() == null){
            this.head = null;
            this.tamanio--;
            return true;
        }
        Nodo<T> currNode = this.head;
        while (currNode.getSiguiente().getSiguiente() != null){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(null);
        this.tamanio--;
        return true;
    }

    public boolean agregarAlInicio(T valor){
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSiguiente(this.head);
        this.head = nuevo;
        this.tamanio++;
        return true;
    }

    public boolean agregar(T valor, int posicion){
        if(posicion < 0 || posicion > this.tamanio){
            return false;
        }
        if(posicion == 0){
            return agregarAlInicio(valor);
        }
        if(posicion == this.tamanio){
            return agregarAlFinal(valor);
        }
        Nodo<T> nuevo = new Nodo<>(valor);
        Nodo<T> currNode = this.head;
        for (int i = 0; i < posicion - 1; i++) {
            currNode = currNode.getSiguiente();
        }
        nuevo.setSiguiente(currNode.getSiguiente());
        currNode.setSiguiente(nuevo);
        this.tamanio++;
        return true;
    }

    public boolean agregarAlFinal(T valor){
        Nodo<T> nuevo = new Nodo<>(valor);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo<T> currNode = head;
            while (currNode.getSiguiente() != null){
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(nuevo);
        }
        this.tamanio++;
        return true;
    }

    public int buscar(T valor){
        Nodo<T> currNode = this.head;
        int contador = 0;
        while (currNode != null){
            if(currNode.getDato().equals(valor)){
                return contador;
            }
            contador++;
            currNode = currNode.getSiguiente();
        }
        return -1;
    }

    public boolean actualizar(T actual, T nuevo){
        Nodo<T> currNode = this.head;
        while (currNode != null){
            if(currNode.getDato().equals(actual)){
                currNode.setDato(nuevo);
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }

    public void transversal(){
        Nodo<T> currNode = this.head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }
}