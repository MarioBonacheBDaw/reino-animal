package es.iesjoseplanes.ed1dawdist.tarea4;

public class Principal {

    public static void main(String[] args) {

/**
    * @author Mario
     
        
/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal("Ramona");

        Mamifero mamifero = new Mamifero("Gofy");

        Perro toby = new Perro("Coco");

        Gato isidoro = new Gato("Isidoro");
        isidoro.setPelos(4);

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + "  es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }
        
        
        System.out.println("____________MOD PARA 2.7__________");
        System.out.println("Animal:     "+animal.getNombre());
        System.out.println("Mamifero:   "+mamifero.getNombre());
        System.out.println("Perro:  "+toby.getNombre());
        System.out.println("Gato:   "+isidoro.getNombre());

    }
}
