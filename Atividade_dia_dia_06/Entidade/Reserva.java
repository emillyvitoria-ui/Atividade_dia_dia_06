package Atividade_dia_dia_06.Entidade;

public class Reserva {

    private int diarias;
    private Quarto quarto;

    public Reserva(int diarias, Quarto quarto) {
        this.diarias = diarias;
        this.quarto = quarto;
    }

    public double calcularTotal() {

        double total = diarias * quarto.getValorDiaria();

        if (diarias > 5) {
            total = total * 0.90;
        }

        return total;
    }
}
