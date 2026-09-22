public class Tarea {
    String nombre;
    String descripcion;
    String estado;
    String prioridad;

    public Tarea(String nombre, String descripcion, String estado, String prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado
                + "\nPrioridad: " + prioridad;
    }
}
