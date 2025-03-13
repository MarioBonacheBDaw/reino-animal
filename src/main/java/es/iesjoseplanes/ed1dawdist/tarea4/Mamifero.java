package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Clase que representa un mamífero, que hereda de la clase Animal.
 * Define comportamientos específicos de los mamíferos, como su tipo de reproducción.
 * 
 * @author Mario
 * @version 1.0
 */
public class Mamifero extends Animal {

    /**
     * Constructor que inicializa el nombre del animal.
     * 
     * @param nombre Nombre del animal
     */
    public Mamifero(String nombre) {
        super(nombre);
    }

    /**
     * Sobrescribe el método reproducir para indicar que la reproducción es vivípara.
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Sobrescribe el método relacionar para personalizar la relación con otro animal.
     * 
     * @param m El animal con el que se relaciona
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}