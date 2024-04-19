package Modelos;

import java.util.List;

public class Menu {
    private List<Produto> produtos;

    public Menu(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void exibirMenuProdutos() {
        System.out.println("\n________________________ Menu de Produtos ________________________\n");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + ". " + produtos.get(i) );
        }
    }

    public Produto escolherProduto(int escolha) {
        if (escolha >= 1 && escolha <= produtos.size()) {
            return produtos.get(escolha - 1);
        } else {
            return null;
        }
    }

    public void adicionarProdutoAoCarrinho(Produto produto, Cartao cartao) {
        cartao.adicionarItemAoCarrinho(produto);
    }
}
