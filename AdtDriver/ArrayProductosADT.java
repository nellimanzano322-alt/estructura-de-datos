package AdtDriver;

import java.util.ArrayList;

public class ArrayProductosADT<T> extends ArrayList<T> {
    private Double promedio;

    public ArrayProductosADT(int tamanio) {
        super(tamanio);
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public void calcularPromedio() {
        Double suma = 0d;
        for (int i = 0; i < this.longitud(); i++) {
            suma += ((Producto)this.obtenerElemento(i)).getPrecio();
        }
        this.promedio = suma / this.longitud();
    }

    private int longitud() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'longitud'");
    }

    private Producto obtenerElemento(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerElemento'");
    }
}    

