package application;

import domain.*;

public class DespacharCamionUseCase {

    private ServicioDespacho servicio = new ServicioDespacho();

    public void ejecutar(Camion camion, Carga carga) {
        servicio.despachar(camion, carga);
    }
}
