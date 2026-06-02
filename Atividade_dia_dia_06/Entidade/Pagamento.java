package Atividade_dia_dia_06.Entidade;
import Atividade_dia_dia_06.Enum.FormaPagamento;
import Atividade_dia_dia_06.Enum.StatusPagamento;
public class Pagamento {
    private FormaPagamento formaPagamento;

    public Pagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusPagamento validarPagamento() {

        if (formaPagamento == FormaPagamento.PIX ||
                formaPagamento == FormaPagamento.CARTAO) {

            return StatusPagamento.APROVADO;
        }

        return StatusPagamento.RECUSADO;
    }
}