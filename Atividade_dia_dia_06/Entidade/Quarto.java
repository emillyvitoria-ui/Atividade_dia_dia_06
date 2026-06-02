package Atividade_dia_dia_06.Entidade;
import Atividade_dia_dia_06.Enum.tipoQuarto;
public class Quarto {

        private int numero;
        private double valorDiaria;
        private tipoQuarto tipo;

        public Quarto(int numero, double valorDiaria, tipoQuarto tipo) {
            this.numero = numero;
            this.valorDiaria = valorDiaria;
            this.tipo = tipo;
        }

        public int getNumero() {
            return numero;
        }

        public double getValorDiaria() {
            return valorDiaria;
        }

        public tipoQuarto getTipo() {
            return tipo;
        }
    }