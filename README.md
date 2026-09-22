# Ejercicio To-Do List

Aplicación de gestión de tareas (estilo To-Do) por consola.

## Funcionalidades

- Añadir tareas con nombre y descripción.
- Mostrar las tareas pendientes.
- Marcar tareas como completadas.
- Eliminar tareas de la lista.
- Control de errores mediante excepciones.
- Filtrar tareas por prioridad.
- Guardar las tareas en un txt.

## Estructura

### Clase Main
Contiene el menú principal y los métodos para gestionar las tareas.

### Clase Tarea
Representa una tarea con:
- Nombre
- Descripción
- Estado: Pendiente o Completado 

*Decidí usar String en `Estado` por si en el futuro se añadiesen otros estados*

### Clase Gestor
- Guarda las tareas en un txt

## Excepciones utilizadas

- `InputMismatchException`: cuando el usuario introduce un valor no numérico en el menú.
- `IndexOutOfBoundsException`: cuando se intenta acceder a una tarea inexistente.

## Ejemplo de uso

```text
1. Añadir tarea
2. Ver tareas pendientes
3. Marcar tarea como completada
4. Eliminar tarea
5.Filtrar por prioridad
0. Salir