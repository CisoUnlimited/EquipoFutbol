package clases.subclases;

import clases.Persona;

public class Medico extends Persona {
    private String titulacion;
    private int añosExperiencia;

    public Medico() {
    }

    public Medico(String nombre, String apellido, String dni, int edad, String titulacion, int añosExperiencia) {
        super(nombre, apellido, dni, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
