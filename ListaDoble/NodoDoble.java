package ListaDoble;
public class NodoDoble<T>{
    private T data;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;

    public NodoDoble() {
    }

    public NodoDoble(T data) {
        this.data = data;
    }

    public NodoDoble(T data, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
        this.data = data;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public NodoDoble(T data, NodoDoble<T> siguiente) {
        this.data = data;
        this.siguiente = siguiente;
    }

    public NodoDoble(NodoDoble<T> anterior, T data) {
        this.anterior = anterior;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "<-" + data  +"->";
    }
}