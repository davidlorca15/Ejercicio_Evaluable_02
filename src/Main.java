import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Tarea> tareas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int respuesta = -1;

        while (respuesta != 0){
            System.out.println();
            System.out.println("Elige una opción");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver tareas pendientes");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("0. Salir");
            try {
                respuesta = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número.");
                sc.nextLine();
            }

            System.out.println();

            switch (respuesta){
                case 0 -> System.out.println("Saliendo del programa...");
                case 1 -> anadirTarea();
                case 2 -> verTareas();
                case 3 -> completarTarea();
                case 4 -> eliminarTarea();
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    public static void anadirTarea(){
        System.out.printf("Introduce el nombre de la tarea: ");
        String nombre = sc.nextLine();
        System.out.printf("Introduce su descripción: ");
        String descripcion = sc.nextLine();
        System.out.println("Introduce el nivel de prioridad (1 (baja),2 (Media),3 (Alta)): ");
        String prioridad = sc.nextLine();

        if (prioridad.equals("1")){
            prioridad = "baja";
        }else if (prioridad.equals("2")){
            prioridad = "media";
        }else if (prioridad.equals("3")){
            prioridad = "alta";
        }else{
            System.out.println("Opción no válida");

        }

        Tarea tarea = new Tarea(nombre, descripcion, "Pendiente", prioridad);
        tareas.add(tarea);
    }
    public static void verTareas() {
        if (tareas.isEmpty()) {
                System.out.println("No hay tareas.");
                return;
            }

        for (int i = 0; i < tareas.size(); i++) {
            if (!tareas.get(i).getEstado().equalsIgnoreCase("Completado")){
                System.out.println("========== TAREA " + (i + 1) + " ==========");
                System.out.println(tareas.get(i));
                System.out.println();
            }
        }
    }
    public static void completarTarea(){
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        System.out.println("Introduce la tarea que quieres completar (1-" + tareas.size() + ")");
        int completar = sc.nextInt() - 1;
        sc.nextLine();

        try {
            if (tareas.get(completar).getEstado().equalsIgnoreCase("Completado")){
                System.out.println("Esa tarea ya está completada");
            } else {
                tareas.get(completar).setEstado("Completado");
                System.out.println("Tarea marcada correctamente.");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Tarea fuera de los límites de la lista");

        }
    }
    public static void eliminarTarea(){
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        try {
            System.out.println("Introduce la tarea que quieres eliminar (1-" + tareas.size() + ")");
            int eliminar = sc.nextInt() - 1;
            sc.nextLine();

            tareas.remove(eliminar);

            System.out.println("Tarea eliminada correctamente.");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Tarea fuera de los límites de la lista");
        }

    }
}
