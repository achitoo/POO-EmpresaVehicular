package Models;


    public class Vehiculo {
        private String placa;
        private String marca;
        private String modelo;
        private int CapacidadPasajeros;
        private Viaje viaje;
        enum TipoVehiculo{auto,moto,camioneta}

        public Vehiculo(String placa, String marca, String modelo, int capacidadPasajeros) {
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
            CapacidadPasajeros = capacidadPasajeros;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getCapacidadPasajeros() {
            return CapacidadPasajeros;
        }

        public void setCapacidadPasajeros(int capacidadPasajeros) {
            CapacidadPasajeros = capacidadPasajeros;
        }
    }
