package ListaDoble;

public class DoubleLinkedList<T> {
    private NodoDoble<T> head;
    private NodoDoble<T> tail;
    private int tamanio;

    public DoubleLinkedList() {
    }
    public boolean estaVacia(){
        return head == null;
    }

    public int getTamanio(){
        return this.tamanio;
    }
    public void agregarAlInicio(T dato){
        if(this.head== null){
            this.head = new NodoDoble<>(dato);
            this.tail = this.head;
            this.tamanio++;
        }else{
            this.head = new NodoDoble<>(dato,this.head,null);
            this.head.getSiguiente().setAnterior(this.head);
            this.tamanio++;
        }
    }
    public void agregarAlFinal(T dato){
        if(this.head== null){
            this.head = new NodoDoble<>(dato);
            this.tail = this.head;
            this.tamanio++;
        }else{
            this.tail = new NodoDoble<>(dato, null, this.tail);
            this.tail.getAnterior().setSiguiente(this.tail);
            this.tamanio++;
        }
    }
    public void agregar(T dato, int posicion){
        if (posicion < 0 || posicion > this.tamanio) {
            System.out.println("Posicion no valida");
            return;
        }
        if (posicion == 0) {
            agregarAlInicio(dato);
            return;
        }
        if (posicion == this.tamanio) {
            agregarAlFinal(dato);
            return;
        }
        NodoDoble<T> currNodo = this.head;
        for (int i = 0; i < posicion - 1; i++) {
            currNodo = currNodo.getSiguiente();
        }
        NodoDoble<T> nuevoNodo = new NodoDoble<>(dato, currNodo.getSiguiente(), currNodo);
        currNodo.getSiguiente().setAnterior(nuevoNodo);
        currNodo.setSiguiente(nuevoNodo);
        this.tamanio++;
    }
    public void eliminarInicio(){
        if (this.head == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        if (this.head.getSiguiente() == null) {
            this.head = null;
            this.tail = null;
            this.tamanio--;
            System.out.println("La lista ahora esta vacia");
        } 
        else {
            this.head = this.head.getSiguiente();
            this.head.setAnterior(null);
            this.tamanio--;
            }

        }
    public void eliminaralfinal(){
        if (this.head == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        if (this.head.getSiguiente() == null) {
            this.head = null;
            this.tail = null;
            this.tamanio--;
            System.out.println("La lista ahora esta vacia");
        } 
        else {
            this.tail = this.tail.getAnterior();
            this.tail.setSiguiente(null);
            this.tamanio--;
            }
        }

        public void eliminar(T dato, int posicion){
        if (posicion < 0 || posicion > this.tamanio) {
            System.out.println("Posicion no valida");
            return;
        }
        if (posicion == 0) {
            eliminarInicio();
            return;
        }
        if (posicion == this.tamanio) {
            eliminaralfinal();
            return;
        }
        NodoDoble<T> currNodo = this.head;
        if (currNodo.getSiguiente()== null) {
            System.out.println("La lista esta vacia");
            return;
        }
        else {
            for (int i = 0; i < posicion - 1; i++) {
                currNodo = currNodo.getSiguiente();
            }
            currNodo.setSiguiente(currNodo.getSiguiente().getSiguiente());
            currNodo.getSiguiente().setAnterior(currNodo);
            this.tamanio--; 
       }
    }
    public boolean actualizar(T actual, T nuevo){
        NodoDoble<T> currNode = this.head;
        while (currNode != null){
            if(currNode.getData().equals(actual)){
                currNode.setData(nuevo);
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }
     public int buscar(T valor){
        NodoDoble<T> currNode = this.head;
        currNode = this.head;
        int contador = 0;
        while (currNode != null){
            if(currNode.getData() == valor){
                return contador;
            }
            contador++;
            currNode = currNode.getSiguiente();
        }
        return -1;
    }

    /**
     *
     * @param direccion 1 de izquierda a derecha, 2 de derecha a izq.
     */
    public void transversal(int direccion){
        NodoDoble<T> currNodo;
        if (direccion == 1){
            currNodo = this.head;
            while (currNodo != null){
                System.out.print(currNodo);
                currNodo= currNodo.getSiguiente();
            }
        }
        if (direccion == 2){
            currNodo = this.tail;
            while (currNodo != null){
                System.out.print(currNodo);
                currNodo=currNodo.getAnterior();
            }
        }
    }
}

