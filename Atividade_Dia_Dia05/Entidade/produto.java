package Atividade_Dia_Dia05.Entidade;

public class produto {
    private String nome;
    private double preco;

    public produto(String nome,double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "produto{" +
                "nome='" + nome +
                ", preco=" + preco
                ;
    }

}
