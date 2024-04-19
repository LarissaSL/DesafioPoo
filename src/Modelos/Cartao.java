package Modelos;

public class Cartao {
    private double limite;
    private double saldo;
    private Carrinho carrinho;

    public Cartao(double limite, Carrinho carrinho) {
        this.limite = limite;
        this.saldo = limite;
        this.carrinho = carrinho;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarItemAoCarrinho(Produto produto) {
        if (saldo >= produto.getPreco()) {
            carrinho.adicionarProduto(produto);
            saldo -= produto.getPreco();
            System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
            System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
        } else {
            System.out.println("Saldo insuficiente. O item não foi adicionado ao carrinho.");
            System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
        }
    }
}
