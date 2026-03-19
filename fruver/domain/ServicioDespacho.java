package domain;

public class ServicioDespacho {

    public void despachar(Camion camion, Carga carga) {
        if (carga.getPeso() > 3000) {
            throw new RuntimeException("Error: El camión supera las 3 toneladas");
        }
        camion.marcarComoDespachado();
    }
}
