package es.iesjoseplanes.ed1dawdist.tarea4;

public class Gato extends Mamifero {

    private int pelos;

    public Gato(String nombre) {
        super(nombre);
    }
    
    /**
     * @return the pelos
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * @param pelos the pelos to set
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

}
