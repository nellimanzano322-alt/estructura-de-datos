
package AdtDriver;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class AdtDriver {
    public static void main(String[] args) {
        //ArrayADT<Producto> productos = new ArrayADT<>(5);
        //productos.establecerElemento(new Producto(1, "Papas fritas", 20), 0);
        //productos.imprimir();

        Path ruta = Path.of("AdtDriver/productos.csv");
        String linea;
        ArrayADT<Producto> productos = new ArrayADT<>(5);
        int contador = 0;
        try(BufferedReader br = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)){
            br.readLine();
            while( (linea = br.readLine()) != null ){
                String[] campos = linea.split(",");
                Producto p = new Producto(Integer.parseInt(campos[0]) , campos[1], Double.parseDouble(campos[2]));
                productos.establecerElemento(p,contador);
                contador++;

            }

            Double suma = 0.0;
            for(int j=0 ;j< productos.longitud(); j++){
                suma += productos.obtenerElemento(j).getPrecio();
            }

            System.out.println("El promedio de los precios es: $" + (suma/productos.longitud()) );

        }catch(IOException ioe){
            System.out.println(ioe.toString());

        }
    }
}