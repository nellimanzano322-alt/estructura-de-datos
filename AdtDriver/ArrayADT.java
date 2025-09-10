package AdtDriver;
public class ArrayADT<T> {
    private  int tamanio;
    private T[] datos;

    public ArrayADT(int tamanio) {
        this.tamanio = tamanio;
        datos = (T[]) new Object[tamanio];
    }

    public  T obtenerElemento(int index){
        if(index < datos.length && index >= 0) {
            return datos[index];
        }else {
            return null;
        }
    }

    public void establecerElemento(T dato, int index){
        if(index < datos.length && index >= 0){
            datos[index] = dato;
        }else  {
            System.out.println("No existe esa posicion en el array");
        }
    }

    public int longitud(){
        return this.tamanio;
    }

    public void limpiar(T dato){
        for(int i=0; i<datos.length; i++){
            datos[i] = dato;
        }
    }

    public void imprimir(){
        for (int i = 0; i < this.tamanio; i++) {
            System.out.print(datos[i] + " --> ");
        }
        System.out.println("");
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.tamanio; i++) {
            res += datos[i] + " --> ";

        }
        return res;
    }


}