package AdtDriver;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjempoProductos {
    public static void main(String[] args) {
       Path ruta = Path.of("AdtDriver/productos.csv");
        String linea;
        int contador = 0;
        int [] lista = new int[100];
        try(BufferedReader br = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)){
            br.readLine();
            while( (linea = br.readLine()) != null ){
                //System.out.println(linea);

                String[] campos = linea.split(",");
                System.out.print("ID:" +campos[0] + " -- ");
                System.out.print("NOMBRE PRODUCTO:" + campos[1] + " -- ");
                System.out.println("PRECIO: $" + campos[2]);
                lista[contador] = Integer.parseInt(campos[2]);
                contador++;
            }
            int suma = 0;
            for(int i = 0; i < contador; i++){
                suma += lista[i];
            }
            System.out.println("El promedio de los precios es: $" + (suma/contador) );

        }catch(IOException ioe){
            System.out.println(ioe.toString());

        }
    }
}