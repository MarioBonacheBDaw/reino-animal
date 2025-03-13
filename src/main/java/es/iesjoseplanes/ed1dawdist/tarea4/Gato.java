package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * Clase que representa un gato, que hereda de la clase Mamífero.
 * Incluye atributos específicos como la cantidad de pelos y comportamientos propios de los gatos.
 * 
 * @author Mario
 * @version 1.0
 */
public class Gato extends Mamifero {

    /**
     * Cantidad de pelos del gato.
     */
    private int pelos;

    /**
     * Constructor que inicializa el nombre del gato.
     * 
     * @param nombre Nombre del gato
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Obtiene la cantidad de pelos del gato.
     * 
     * @return La cantidad de pelos
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Establece la cantidad de pelos del gato.
     * 
     * @param pelos La nueva cantidad de pelos
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
     * Sobrescribe el método dormir para definir el comportamiento del gato.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Método que define el sonido característico del gato.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Sobrescribe el método relacionar para personalizar la relación con otro animal.
     * 
     * @param p El animal con el que se relaciona
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }
}
