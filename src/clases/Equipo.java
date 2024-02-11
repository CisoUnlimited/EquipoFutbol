package clases;

public class Equipo {
    private String nombre;
    private String localidad;
    private String entrenador;
    private String medico;
    private String[] miembros;

    public Equipo(String nombre, String localidad, String entrenador, String medico, String[] miembros) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.entrenador = entrenador;
        this.medico = medico;
        this.miembros = miembros;
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

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String[] getMiembros() {
        return miembros;
    }

    public void setMiembros(String[] miembros) {
        this.miembros = miembros;
    }
}
