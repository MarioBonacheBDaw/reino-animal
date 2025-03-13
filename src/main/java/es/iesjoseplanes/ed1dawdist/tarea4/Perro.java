package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Clase que representa un perro, que hereda de la clase Mamífero.
 * Incluye comportamientos específicos como ladrar, gruñir y una forma particular de dormir.
 * 
 * @author Mario
 * @version 1.0
 */
public class Perro extends Mamifero {

    /**
     * Constructor que inicializa el nombre del perro.
     * 
     * @param nombre Nombre del perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Sobrescribe el método dormir para especificar que el sueño depende del ejercicio realizado.
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en función del ejercicio que realiza");
    }

    /**
     * Método que representa el ladrido del perro.
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Método que representa el gruñido del perro.
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Sobrescribe el método relacionar para personalizar la relación con otro animal.
     * 
     * @param p El animal con el que se relaciona
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }
}