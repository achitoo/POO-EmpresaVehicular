package Models;

public class Viaje {
    private String origen;
    private String destino;
    private double costo;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Viaje() {
    }

    public Viaje(String origen, String destino, double costo, Cliente cliente, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "=== Información del Viaje ===\n" +
                "Origen: " + origen + "\n" +
                "Destino: " + destino + "\n" +
                "Costo: $" + costo + "\n" +
                "Cliente: " + (cliente != null ? cliente.getNombre() : "N/A") + "\n" +
                "Vehículo: " + (vehiculo != null ? vehiculo.getModelo() + " [" + vehiculo.getplaca() + "]" : "N/A");
    }
}