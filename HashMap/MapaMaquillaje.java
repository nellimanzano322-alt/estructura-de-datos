package HashMap;

import java.util.HashMap; 

public class MapaMaquillaje {
    public static void main(String[] args) {
        HashMap<Integer, Maquillaje> mapaMaquillaje = new HashMap<>();

        mapaMaquillaje.put(1, new Maquillaje("Labial", "Rojo", 99.99));
        mapaMaquillaje.put(2, new Maquillaje("Delineador", "Negro", 49.99));
        mapaMaquillaje.put(3, new Maquillaje("Rubor", "Rosa", 79.99));
        mapaMaquillaje.put(4, new Maquillaje("Sombra", "Marrón", 59.99));
        mapaMaquillaje.put(5, new Maquillaje("Base", "Pastelle", 129.99));
        mapaMaquillaje.put(6, new Maquillaje("Máscara", "Negro", 89.99));
        mapaMaquillaje.put(7, new Maquillaje("Lápiz Labial", "Café", 39.99));
        mapaMaquillaje.put(8, new Maquillaje("Brillos", "Plateados", 49.99));
        mapaMaquillaje.put(9, new Maquillaje("Polvo", "Pastelle", 69.99));
        mapaMaquillaje.put(10, new Maquillaje("Brochas", "Blancas", 59.99));

        for (Integer clave : mapaMaquillaje.keySet()) {
            System.out.println("Clave: " + clave + " - Valor: " + mapaMaquillaje.get(clave));
        }

        System.out.println("\nTamaño del mapa: " + mapaMaquillaje.size());
        System.out.println("\nBuscando el maquillaje con clave 5: " + mapaMaquillaje.get(5));

        mapaMaquillaje.remove(3);
        System.out.println("\nMapa después de eliminar la clave 3:");
        for (Integer clave : mapaMaquillaje.keySet()) {
            System.out.println("Clave: " + clave + " - Valor: " + mapaMaquillaje.get(clave));
        }
    }
}