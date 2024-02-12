package clases;

import clases.Persona;

public class Futbolista extends Persona {
    private int numero;
    private String posicion;
    private int resistencia;
    private int lesiones;

    public Futbolista() {
    }

    public Futbolista(String nombre, String apellido, String dni, int edad, int numero, String posicion, int resistencia, int lesiones) {
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

    public int getLesiones() {
        return lesiones;
    }

    public void setLesiones(int lesiones) {
        this.lesiones = lesiones;
    }

    // Con las lesiones, se pierde resistencia y aumentan las lesiones
    public void lesionarse() {
        if (getResistencia()>0) {
            setLesiones(getLesiones()+1);
            setResistencia(getResistencia()-1);
        }
    }

    // Con curarse, aumentamos resistencia y dismunuyen lesiones
    public void curarse() {
        if (getLesiones()>0) {
            setLesiones(getLesiones()-1);
            setResistencia(getResistencia()+1);
        }
    }

    // Con entrenar, aumentamos el cap de resistencia en un determinado entero que depende del tipo de entrenamiento
    public void entrenar() {

    }

    // Con entrevistarse, el futbolista dice su nombre y el número de goles que ha anotado
    public void entrevistarse() {

    }

    @Override
    public String rolEnEquipo() {
        setRol("Futbolista");
        return super.rolEnEquipo();
    }
}
