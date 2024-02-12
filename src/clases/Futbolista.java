package clases;

import clases.Persona;

import java.util.Scanner;

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
        } else if (getResistencia()>=0) {
            setResistencia(getResistencia()+1);
        }
    }

    // Con entrenar, aumentamos el cap de resistencia en un determinado entero que depende del tipo de entrenamiento
    public void entrenar(int opcion) {
        Scanner keyboard = new Scanner(System.in);
        opcion = keyboard.nextInt();
        switch (opcion) {
            case 1:
                setResistencia(getResistencia()+1);
                break;
            case 2:
                setResistencia(getResistencia()+3);
                break;
            case 3:
                setResistencia(getResistencia()+5);
                break;
            default:
                break;
        }
    }

    // Con entrevistarse, el futbolista dice su nombre y el número de goles que ha anotado
    public void entrevistarse() {
        System.out.println("Soy " + getNombre() + " y he anotado " +  " goles.");
    }

    @Override
    public String rolEnEquipo() {
        setRol("Futbolista");
        return super.rolEnEquipo();
    }
}
