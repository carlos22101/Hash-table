import java.util.Hashtable;
import java.util.Scanner;

public class EJemploHashTable{
static Hashtable<Estudiante, Integer> TablaEstudiantes=new Hashtable<>();

public static void main(String[] args) {
    verMenu();
  
    }
 public static void verInformacion(){
    System.out.println("tabla vacia: "+TablaEstudiantes.isEmpty());
    System.out.println( "Número de keys en la tabla: " + TablaEstudiantes.size());
}

public static void ingresarDatos(Estudiante obj1, Estudiante obj2){
    obj1.setApellido("Cancino");
    obj1.setNombre("Sara");
    obj2.setApellido("López");
    obj2.setNombre("Juan");
    TablaEstudiantes.put(obj2, 223569);
    TablaEstudiantes.put(obj1, 233547);
}

public static void imprimir(Estudiante obj1, Estudiante obj2){
    System.out.println("Valor: " + TablaEstudiantes.get(obj2));
    System.out.println( "Existe el valor 233547: " + TablaEstudiantes.contains(233547));
    System.out.println("Existe el valor 201456: " + TablaEstudiantes.contains(201456));
    System.out.println("Existe la clave: " + TablaEstudiantes.containsKey(obj1));
}

public static void eliminar(Estudiante obj1, Estudiante obj2){
    Scanner entrada = new Scanner(System.in);
    int opcion;
    System.out.println("indica la clave a eliminar 1)obj1 \t 2) obj2");
    opcion=entrada.nextInt();
    if (opcion==1) {
        TablaEstudiantes.remove(obj1);}
       else if (opcion==2){
        TablaEstudiantes.remove(obj2);
        }
        else
        {
            System.out.println("Opción incorrecta");
        }
}


public static void verMenu(){
    Estudiante obj1 = new Estudiante();
    Estudiante obj2 = new Estudiante();
    Scanner entrada = new Scanner(System.in);
    int opcion;
    do{
        System.out.println("1) Cargar datos \n 2) ver información de la tabla \n 3) Imprimir \n 4) Eliminar \n 5)Salir");
        opcion = entrada.nextInt();
    switch (opcion) {
    case 1: ingresarDatos(obj1, obj2);
        break;
    case 2: verInformacion();
    break;
    case 3: imprimir(obj1, obj2);
    break;
    case 4: eliminar(obj1, obj2);
    System.out.println("Numero de keys en la tabla: " +TablaEstudiantes.size());
    break;
    default:
        break;
}
    }while(opcion!=5);
}
}