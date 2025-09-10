package Ajedrez;

public class TableroAjedrez {
     public static void main(String[] args) {
        Array2D<String> tablero = new Array2D<>(8, 8);

        // Casillas vacías
        tablero.limpiar("·");

        // Piezas negras
        String rB = "♜", nB = "♞", bB = "♝", qB = "♛", kB = "♚", pB = "♟";
        // Piezas blancas
        String rW = "♖", nW = "♘", bW = "♗", qW = "♕", kW = "♔", pW = "♙";

        // Fila 0 (negras mayores)
        tablero.establecerElemento(0,0,rB); tablero.establecerElemento(0,1,nB);
        tablero.establecerElemento(0,2,bB); tablero.establecerElemento(0,3,qB);
        tablero.establecerElemento(0,4,kB); tablero.establecerElemento(0,5,bB);
        tablero.establecerElemento(0,6,nB); tablero.establecerElemento(0,7,rB);

        // Fila 1 (peones negros)
        for(int c=0;c<8;c++) tablero.establecerElemento(1,c,pB);

        // Fila 6 (peones blancos)
        for(int c=0;c<8;c++) tablero.establecerElemento(6,c,pW);

        // Fila 7 (blancas mayores)
        tablero.establecerElemento(7,0,rW); tablero.establecerElemento(7,1,nW);
        tablero.establecerElemento(7,2,bW); tablero.establecerElemento(7,3,qW);
        tablero.establecerElemento(7,4,kW); tablero.establecerElemento(7,5,bW);
        tablero.establecerElemento(7,6,nW); tablero.establecerElemento(7,7,rW);

        // Imprimir tablero con toString()
        System.out.println(tablero.toString());
    }
}

class Array2D<T> {
    private final int renglones;
    private final int columnas;
    private final Object[][] datos;

    public Array2D(int ren, int col) {
        this.renglones = ren;
        this.columnas = col;
        this.datos = new Object[ren][col];
    }

    public void limpiar(T dato) {
        for(int r=0;r<renglones;r++)
            for(int c=0;c<columnas;c++)
                datos[r][c] = dato;
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

        // imprimir filas (8 a 1)
        for (int r = renglones - 1; r >= 0; r--) {
            sb.append(r + 1).append(" "); // número de fila
            for (int c = 0; c < columnas; c++) {
                sb.append(datos[r][c]).append(" ");
            }
            sb.append("\n");
        }

        // letras de columnas (a-h)
        sb.append("  ");
        for (char c = 'a'; c < 'a' + columnas; c++) {
            sb.append(c).append(" ");
        }
        sb.append("\n");

        return sb.toString();
    }
}
