import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Modelos.Carrinho;
import Modelos.Cartao;
import Modelos.Menu;
import Modelos.Produto;

public class Main {
    public static void main(String[] args) {
        Produto cereal = new Produto("Cereal", 2.99, "Chokipik");
        Produto paoDeForma = new Produto("Pão de Forma", 1.0, "Ron´s");
        Produto farinha = new Produto("Farinha", 0.79, "Kraftung");
        Produto oleo = new Produto("Óleo", 1.50, "Lespieds");
        Produto macarrao = new Produto("Macarrão", 7.92, "Panzati");
        Produto acucarEmPo = new Produto("Açúcar em Pó", 1.15, "Susu");
        Produto agua = new Produto("Água", 0.95, "Aotte");
        Produto queijo = new Produto("Queijo", 1.79, "Comtê");
        Produto cafeEscuro = new Produto("Café Escuro", 5.92, "Narvalo");
        Produto ovos = new Produto("Ovos - Pacote de 8", 2.39, "Bio");
        Produto leite = new Produto("Leite", 0.75, "Bourlat");
        Produto chaPreto = new Produto("Chá preto", 2.75, "TeaPalace");

        List<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(cereal);
        listaDeProdutos.add(paoDeForma);
        listaDeProdutos.add(farinha);
        listaDeProdutos.add(oleo);
        listaDeProdutos.add(macarrao);
        listaDeProdutos.add(acucarEmPo);
        listaDeProdutos.add(agua);
        listaDeProdutos.add(queijo);
        listaDeProdutos.add(cafeEscuro);
        listaDeProdutos.add(ovos);
        listaDeProdutos.add(leite);
        listaDeProdutos.add(chaPreto);

        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(listaDeProdutos);
        int opcao = 0;

        System.out.println("Digite o Limite do seu Cartão: ");
        double limite = scanner.nextDouble();
        Cartao cartao = new Cartao(limite, carrinho);

        System.out.println("\n|               Boas Vindas ao Mercadinho Simulator               |\n");
        do {
            menu.exibirMenuProdutos();

            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Para Adicionar Itens ao Carrinho\n2 - Para Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nEscolha o número do Produto para Adiciona-ló ao Carrinho: ");
                    int escolha = scanner.nextInt();
                    Produto produtoEscolhido = menu.escolherProduto(escolha);
                    if (produtoEscolhido != null) {
                        menu.adicionarProdutoAoCarrinho(produtoEscolhido, cartao);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    System.out.println("\n_______________________ Itens no Carrinho _______________________");
                    carrinho.ordenaProdutosPorPreco();
                    carrinho.listaProdutos();
                    System.out.printf("Saldo restante: R$ %.2f%n", cartao.getSaldo());
                    System.out.println("Agradecemos a preferência, volte sempre");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 2);
    }
}
