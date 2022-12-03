package Principal;

import Salud.Persona3;

/**
 *
 * @author Jennifer
 */
public class Incio_3 {
    public static void main(String[] args) {

        Persona_3 datos = new Persona_3();

        Persona_3 datos1 = new Persona_3("cc", "1013676004", "Juan", "Susa", 25, (float) 1.70, 70, "Masculino");
        datos1.consultarPersona("Juan");
    }
}