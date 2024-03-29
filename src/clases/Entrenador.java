package clases;

import clases.Persona;

public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellido, String dni, int edad, String estrategia) {
        super(nombre, apellido, dni, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public String rolEnEquipo() {
        setRol("Entrenador");
        return super.rolEnEquipo();
    }
}
