import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class EJemploHashTable {
    static Hashtable<String, Atleta> tablaAtletas = new Hashtable<>();

    public static void main(String[] args) {
        verMenu();
    }

    public static void cargarDatosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    String nombre = datos[0];
                    String apellidoPaterno = datos[1];
                    int edad = Integer.parseInt(datos[2]);
                    String sexo = datos[3];
                    String categoria = datos[4];
                    Atleta atleta = new Atleta(nombre, apellidoPaterno, edad, sexo, categoria);
                    tablaAtletas.put(apellidoPaterno, atleta);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void verInformacion() {
        System.out.println("Tabla vacía: " + tablaAtletas.isEmpty());
        System.out.println("Número de atletas en la tabla: " + tablaAtletas.size());
        for (Atleta atleta : tablaAtletas.values()) {
            System.out.println(atleta);
        }
    }

    public static void eliminarAtleta(String apellidoPaterno) {
        if (tablaAtletas.remove(apellidoPaterno) != null) {
            System.out.println("Atleta con apellido " + apellidoPaterno + " eliminado.");
        } else {
            System.out.println("Atleta con apellido " + apellidoPaterno + " no encontrado.");
        }
    }

    public static void buscarAtletaPorCategoria(String categoria) {
        System.out.println("Atletas en la categoría " + categoria + ":");
        for (Atleta atleta : tablaAtletas.values()) {
            if (atleta.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(atleta);
            }
        }
    }

    public static void verMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1) Cargar datos desde archivo\n2) Ver información de la tabla\n3) Eliminar atleta\n4) Buscar atleta por categoría\n5) Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del archivo:");
                    String nombreArchivo = entrada.nextLine();
                    cargarDatosDesdeArchivo(nombreArchivo);
                    break;
                case 2:
                    verInformacion();
                    break;
                case 3:
                    System.out.println("Introduce el apellido paterno del atleta a eliminar:");
                    String apellidoPaterno = entrada.nextLine();
                    eliminarAtleta(apellidoPaterno);
                    break;
                case 4:
                    System.out.println("Introduce la categoría a buscar (Novato, Consolidado, Veterano):");
                    String categoria = entrada.nextLine();
                    buscarAtletaPorCategoria(categoria);
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
        entrada.close();
    }
}
