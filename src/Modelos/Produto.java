package Modelos;

public class Produto {
    private String nome;
    private double preco;
    private String marca;

    public Produto(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String nomeFormatado = String.format("%-25s", getNome());
        String marcaFormatada = String.format("%-20s", getMarca());
        String precoFormatado = String.format("R$ %.2f", getPreco());
        return "| " + nomeFormatado + " | " + marcaFormatada + " |  " + precoFormatado + "  |";
    }

}
