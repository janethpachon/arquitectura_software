package infrastructure;

import domain.*;

public class CamionRepositoryImpl implements CamionRepository {

    @Override
    public Camion obtenerPorId(int id) {
        return new Camion(id, 2500);
    }

    @Override
    public void guardar(Camion camion) {
        System.out.println("Camión guardado en base de datos.");
    }
}
