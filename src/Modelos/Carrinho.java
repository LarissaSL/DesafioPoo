package Modelos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrinho {
    private List<Produto> listaDeProdutos;

    public Carrinho() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public int obtemTotalDeItens() {
        return this.listaDeProdutos.size();
    }

    public double obtemTotalDaCompra() {
        double valorDaCompra = 0.0;

        for (Produto produto : listaDeProdutos) {
            valorDaCompra += produto.getPreco();
        }

        return valorDaCompra;
    }

    public boolean adicionarProduto(Produto produto) {
        return listaDeProdutos.add(produto);
    }

    public List<Produto> ordenaProdutosPorPreco() {
        listaDeProdutos.sort(Comparator.comparingDouble(Produto::getPreco).reversed());
        return listaDeProdutos;
    }

    public void listaProdutos() {
        System.out.println("|           Lista de Produtos - Mercadinho Simulator           |\n");

        for (Produto item : listaDeProdutos) {
            System.out.println(item.toString());
        }

        System.out.println("Total de itens: " + this.obtemTotalDeItens());
        System.out.printf("%nTotal da Compra: R$ %.2f%n", this.obtemTotalDaCompra());
    }
}
