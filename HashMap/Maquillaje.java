package HashMap;

public class Maquillaje {
    private String nombre;
    private String color;
    private double precio;

    public Maquillaje(String nombre, String color, double precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Maquillaje{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
