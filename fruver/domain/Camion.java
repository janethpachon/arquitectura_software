package domain;

public class Camion {
    private int id;
    private double pesoTotal;
    private boolean despachado;

    public Camion(int id, double pesoTotal) {
        this.id = id;
        this.pesoTotal = pesoTotal;
        this.despachado = false;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void marcarComoDespachado() {
        this.despachado = true;
        System.out.println("Camión despachado correctamente.");
    }
}
