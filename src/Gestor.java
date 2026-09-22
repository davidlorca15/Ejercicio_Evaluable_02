import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gestor {

    public static void guardarTareas(ArrayList<Tarea> tareas) {
        try {
            File archivoTxt = new File("tareas.txt");

            System.out.println("TXT guardado en: " + archivoTxt.getAbsolutePath());

            FileWriter archivo = new FileWriter(archivoTxt);

            for (Tarea tarea : tareas) {
                archivo.write(tarea.toString());
                archivo.write("\n\n");
            }

            archivo.close();

        } catch (IOException e) {
            System.out.println("Error al guardar las tareas.");
            e.printStackTrace();
        }
    }
}