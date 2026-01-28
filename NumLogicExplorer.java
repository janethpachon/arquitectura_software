
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class GameModel {
    private int secretNumber;
    private int attempts;
    private long startTime;
    private int min;
    private int max;

    public GameModel(int min, int max) {
        this.min = min;
        this.max = max;
        Random random = new Random();
        secretNumber = random.nextInt(max - min + 1) + min;
        attempts = 0;
        startTime = System.currentTimeMillis();
    }

    public boolean isWithinRange(int number) {
        return number >= min && number <= max;
    }

    public String checkNumber(int guess) {
        attempts++;
        if (guess < secretNumber) {
            return "Es mayor";
        } else if (guess > secretNumber) {
            return "Es menor";
        } else {
            return "Correcto";
        }
    }

    public int getAttempts() {
        return attempts;
    }

    public long getElapsedTime() {
        return (System.currentTimeMillis() - startTime) / 1000;
    }
}

class GameView {
    private Scanner scanner = new Scanner(System.in);

    public int selectDifficulty() {
        System.out.println("Seleccione nivel de dificultad:");
        System.out.println("1. Básico (1-10)");
        System.out.println("2. Intermedio (1-100)");
        System.out.println("3. Avanzado (1-1000)");
        return scanner.nextInt();
    }

    public int getUserInput() {
        while (true) {
            try {
                System.out.print("Ingrese un número: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debe ser numérica.");
                scanner.next();
            }
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

class GameController {
    private GameModel model;
    private GameView view;

    public GameController() {
        view = new GameView();
    }

    public void startGame() {
        int level = view.selectDifficulty();
        int min = 1;
        int max = switch (level) {
            case 2 -> 100;
            case 3 -> 1000;
            default -> 10;
        };

        model = new GameModel(min, max);

        while (true) {
            int guess = view.getUserInput();

            if (!model.isWithinRange(guess)) {
                view.showMessage("Número fuera de rango.");
                continue;
            }

            String result = model.checkNumber(guess);
            if (result.equals("Correcto")) {
                view.showMessage("¡Adivinaste!");
                view.showMessage("Intentos: " + model.getAttempts());
                view.showMessage("Tiempo: " + model.getElapsedTime() + " segundos");
                break;
            } else {
                view.showMessage(result);
            }
        }
    }
}

public class NumLogicExplorer {
    public static void main(String[] args) {
        GameController controller = new GameController();
        controller.startGame();
    }
}
