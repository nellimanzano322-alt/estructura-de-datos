package Juegodelavida;
public class Array2D<T> {
    private final int renglones;
    private final int columnas;
    private final Object[][] datos;

    public Array2D(int ren, int col) {
        this.renglones = ren;
        this.columnas = col;
        this.datos = new Object[ren][col];
    }

    public void limpiar(T dato) {
        for (int r = 0; r < renglones; r++) {
            for (int c = 0; c < columnas; c++) {
                datos[r][c] = dato;
            }
        }
    }

    public int getNumRenglones() { return renglones; }
    public int getNumColumnas() { return columnas; }

    public void establecerElemento(int ren, int col, T dato) {
        datos[ren][col] = dato;
    }

    @SuppressWarnings("unchecked")
    public T obtenerElemento(int ren, int col) {
        return (T) datos[ren][col];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < renglones; r++) {
            for (int c = 0; c < columnas; c++) {
                sb.append(datos[r][c]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}