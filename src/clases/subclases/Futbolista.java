package clases.subclases;

import clases.Persona;

public class Futbolista extends Persona {
    private int numero;
    private String posicion;
    private int resistencia;
    private String lesiones;

    public Futbolista(String nombre, String apellido, String dni, int edad, int numero, String posicion, int resistencia, String lesiones) {
        super(nombre, apellido, dni, edad);
        this.numero = numero;
        this.posicion = posicion;
        this.resistencia = resistencia;
        this.lesiones = lesiones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getLesiones() {
        return lesiones;
    }

    public void setLesiones(String lesiones) {
        this.lesiones = lesiones;
    }

    // Con las lesiones, se pierde resistencia y aumentan las lesiones
    public static void lesionarse() {

    }

    // Con curarse, aumentamos resistencia y dismunuyen lesiones
    public static void curarse() {

    }

    // Con entrenar, aumentamos el cap de resistencia en un determinado entero que depende del tipo de entrenamiento
    public static void entrenar() {

    }

    // Con entrevistarse, el futbolista dice su nombre y el número de goles que ha anotado
    public static void entrevistarse() {

    }
}
