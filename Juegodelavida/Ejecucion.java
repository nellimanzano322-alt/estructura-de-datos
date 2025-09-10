package Juegodelavida;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal para ejecutar el Juego de la Vida
 * Autor: Nelli Yareni Manzano Solis
 */
public class Ejecucion {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Juego de la Vida");

        // Configuración inicial: un "glider"
        List<int[]> configInicial = new ArrayList<>();
        configInicial.add(new int[]{1, 2});
        configInicial.add(new int[]{2, 3});
        configInicial.add(new int[]{3, 1});
        configInicial.add(new int[]{4, 2});
        configInicial.add(new int[]{5, 3});

        JuegodelaVida juego = new JuegodelaVida(10, 10, configInicial);

        System.out.println("Generación 0:");
        juego.imprimeGrid();

        for (int gen = 1; gen<= 10; gen++) {
            juego.evoluciona();
            System.out.println("Generación " + gen + ":");
            juego.imprimeGrid();
        }
    }
}