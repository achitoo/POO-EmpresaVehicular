package Models;

public class Conductor {
    private String nombreConductor;
    private String licencia;
    private int aniosExperiencia;
    private Vehiculo vehiculo;

    public String getNombreConductor(String nombreConductor) {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor(String nombreConductor, String licencia, int aniosExperiencia, Vehiculo vehiculo) {
        this.nombreConductor = nombreConductor;
        this.licencia = licencia;
        this.aniosExperiencia = aniosExperiencia;
        this.vehiculo = vehiculo;


    }
}

