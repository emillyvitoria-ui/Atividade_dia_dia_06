package Atividade_dia_dia_06.Aplicativo;
import java.util.Scanner;

import Atividade_dia_dia_06.Entidade.Pagamento;
import Atividade_dia_dia_06.Entidade.Quarto;
import Atividade_dia_dia_06.Entidade.Reserva;

import Atividade_dia_dia_06.Enum.FormaPagamento;
import Atividade_dia_dia_06.Enum.StatusPagamento;
import Atividade_dia_dia_06.Enum.tipoQuarto;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite a data de check-in: ");
        String checkIn = sc.nextLine();

        System.out.print("Digite a data de check-out: ");
        String checkOut = sc.nextLine();

        System.out.print("Quantidade de hóspedes: ");
        int hospedes = sc.nextInt();

        Quarto quarto1 = new Quarto(101, 150, tipoQuarto.TRADICIONAL);
        Quarto quarto2 = new Quarto(102, 250, tipoQuarto.LUXO);

        System.out.println("\nQuartos disponíveis:");
        System.out.println("1 - " + quarto1.getTipo() + " - R$ " + quarto1.getValorDiaria());
        System.out.println("2 - " + quarto2.getTipo() + " - R$ " + quarto2.getValorDiaria());

        System.out.print("Escolha um quarto: ");
        int opcao = sc.nextInt();

        Quarto quartoEscolhido;

        if (opcao == 1) {
            quartoEscolhido = quarto1;
        } else {
            quartoEscolhido = quarto2;
        }

        System.out.print("Quantidade de diárias: ");
        int diarias = sc.nextInt();

        Reserva reserva = new Reserva(diarias, quartoEscolhido);

        double total = reserva.calcularTotal();

        System.out.println("Valor total da hospedagem: R$ " + total);

        System.out.println("Forma de pagamento:");
        System.out.println("1 - PIX");
        System.out.println("2 - CARTAO");
        System.out.println("3 - BOLETO");

        int escolhaPagamento = sc.nextInt();

        FormaPagamento formaPagamento;

        if (escolhaPagamento == 1) {
            formaPagamento = FormaPagamento.PIX;
        }
        else if (escolhaPagamento == 2) {
            formaPagamento = FormaPagamento.CARTAO;
        }
        else {
            formaPagamento = FormaPagamento.BOLETO;
        }

        Pagamento pagamento = new Pagamento(formaPagamento);

        StatusPagamento status = pagamento.validarPagamento();

        if (status == StatusPagamento.RECUSADO) {

            System.out.println("Pagamento recusado.");

        } else {

            System.out.println("Reserva gerada.");
            System.out.println("Hospedagem registrada.");
            System.out.println("Confirmação enviada por e-mail.");
            System.out.println("Reserva confirmada.");
        }


    }
}




