package Lista;
import java.util.ArrayList;

public class SetADT<T> {
    private ArrayList<T> data;

    public SetADT() {
        data = new ArrayList<>();
    }

    public int longitud() {
        return data.size();
    }

    public void agregar(T elemento) {
        if (!this.contiene(elemento)) {
            data.add(elemento);
        }
    }

    // acepta cualquier objeto (para evitar problemas con equals)
    public boolean contiene(Object elemento) {
        return data.contains(elemento);
    }

    public void eliminar(T elemento) {
        if(this.contiene(elemento)){
        data.remove(elemento);
        System.out.println("El elemento " + elemento + " ha sido eliminado del conjunto");}
        else{
            System.out.println("El elemento " + elemento + " no se encuentra en el conjunto");
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        for (T t : data) {
            resultado += "," + t.toString();
        }
        return resultado.isEmpty() ? "[]" : "[" + resultado.substring(1) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        SetADT<?> setADT = (SetADT<?>) obj;

        if (this.longitud() != setADT.longitud()) return false;

        for (T t : this.data) {
            if (!setADT.contiene(t)) return false;
        }

        return true;
    }
    public boolean esSubconjunto(SetADT<T> otroConjunto) {
        for (T elemento : this.data) {
            if (!otroConjunto.contiene(elemento )) {
                return false ;
            }
        }
        return true;
    }
    public void union (SetADT<T> otroConjunto) {
        for (T elemento : otroConjunto.data) {
            this.agregar(elemento);
        }}
    public void interseccion (SetADT<T> otroConjunto) {
        ArrayList<T> elementosAEliminar = new ArrayList<>();
        for (T elemento : this.data) {
            if (!otroConjunto.contiene(elemento)) {
                elementosAEliminar.add(elemento);
            }
        }
        for (T elemento : elementosAEliminar) {
            this.eliminar(elemento);
        }
    }
    public void diferencia (SetADT<T> otroConjunto) {
        for (T elemento : otroConjunto.data) {
            this.eliminar(elemento);
        }
    }
}