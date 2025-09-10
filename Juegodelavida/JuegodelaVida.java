package Juegodelavida;
import java.util.List;

/**
 * Implementación del Juego de la Vida
 * Autor: Nelli Yareni Manzano Solis
 */
public class JuegodelaVida {
    private Array2D<Integer> grid;
    private int rows;
    private int cols;

    public JuegodelaVida(int rows, int cols, List<int[]> configInicial) {
        this.rows = rows;
        this.cols = cols;
        grid = new Array2D<>(rows, cols);
        grid.limpiar(0);

        // Configuración inicial
        for (int[] celula : configInicial) {
            grid.establecerElemento(celula[0], celula[1], 1);
        }
    }

    private int getVecinosVivos(int row, int col) {
        int vecinos = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;
                int nr = row + dr;
                int nc = col + dc;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    vecinos += grid.obtenerElemento(nr, nc);
                }
            }
        }
        return vecinos;
    }

    public void evoluciona() {
        Array2D<Integer> nueva = new Array2D<>(rows, cols);
        nueva.limpiar(0);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int vivos = getVecinosVivos(r, c);
                int estado = grid.obtenerElemento(r, c);

                if (estado == 1 && (vivos == 2 || vivos == 3)) {
                    nueva.establecerElemento(r, c, 1);
                } else if (estado == 0 && vivos == 3) {
                    nueva.establecerElemento(r, c, 1);
                }
            }
        }
        grid = nueva;
    }

    public void imprimeGrid() {
        for (int r = 0; r < rows; r++) {
            StringBuilder fila = new StringBuilder();
            for (int c = 0; c < cols; c++) {
                fila.append(grid.obtenerElemento(r, c) == 1 ? " ■ " : " · ");
            }
            System.out.println(fila);
        }
        // Línea divisoria compatible con cualquier versión de Java
        for (int i = 0; i < cols * 3; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}