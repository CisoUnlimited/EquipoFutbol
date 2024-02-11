package clases;

import clases.subclases.Entrenador;
import clases.subclases.Futbolista;
import clases.subclases.Medico;
import sun.jvm.hotspot.gc.x.XForwardingEntry;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String localidad;
    private Entrenador entrenador;
    private Medico medico;
    private Futbolista[] futbolistas = new Futbolista[10];

    public Equipo() {
    }

    public Equipo(String nombre, String localidad, Entrenador entrenador, Medico medico, Futbolista[] futbolistas) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.entrenador = entrenador;
        this.medico = medico;
        this.futbolistas = futbolistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Futbolista[] getFutbolistas() {
        return futbolistas;
    }

    public void setFutbolistas(Futbolista[] futbolistas) {
        this.futbolistas = futbolistas;
    }

    public void dwfdw(Futbolista futbolista) {
        for (int i = 0; i < futbolistas.length; i++) {
            futbolistas[i] = futbolista;
        }
    }
}
