package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Clase que representa un animal con atributos y comportamientos básicos.
 * Permite definir su nombre y realizar acciones esenciales como comer, dormir,
 * reproducirse y relacionarse con otros animales.
 * 
 * @author Mario
 * @version 1.0
 */
public class Animal {

    /**
     * Nombre del animal.
     */
    private String nombre;

    /**
     * Constructor que inicializa el nombre del animal.
     * 
     * @param nombre Nombre del animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     * 
     * @param nombre El nuevo nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Simula la acción de comer del animal.
     */
    void comer() {
        System.out.println("Necesita comer diariamente para sobrevivir");
    }

    /**
     * Simula la acción de dormir del animal.
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Simula la acción de reproducción del animal.
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     * Simula la relación del animal con otro animal.
     * 
     * @param a El animal con el que se relaciona
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    /**
     * Devuelve una representación en cadena del objeto.
     * 
     * @return El nombre del animal
     */

    String ToString() {
        return this.getNombre();
    }
}
