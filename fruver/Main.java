
import application.DespacharCamionUseCase;
import domain.Camion;
import domain.CamionRepository;
import domain.Carga;
import infrastructure.CamionRepositoryImpl;

public class Main {
    public static void main(String[] args) {

        CamionRepository repo = new CamionRepositoryImpl();

        Camion camion = repo.obtenerPorId(1);
        Carga carga = new Carga(2500);

        DespacharCamionUseCase useCase = new DespacharCamionUseCase();

        try {
            useCase.ejecutar(camion, carga);
            repo.guardar(camion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
