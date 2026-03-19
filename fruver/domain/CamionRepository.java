package domain;

public interface CamionRepository {
    Camion obtenerPorId(int id);
    void guardar(Camion camion);
}
