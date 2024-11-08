import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    // Cadastro de Produtos
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado: " + produto.getNome());
    }

    // Atualização de Estoque (Entrada/Saída de Produtos)
    public void atualizarEstoque(String nomeProduto, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                int novaQuantidade = produto.getQuantidade() + quantidade;
                if (novaQuantidade >= 0) {
                    produto.setQuantidade(novaQuantidade);
                    System.out.println("Estoque atualizado para o produto " + nomeProduto + ": " + novaQuantidade);
                } else {
                    System.out.println("Erro: quantidade insuficiente no estoque para a operação.");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nomeProduto);
    }

    // Rastreamento de Localização
    public void rastrearProduto(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                System.out.println("Localização do produto " + nomeProduto + ": " + produto.getLocalizacao());
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nomeProduto);
    }

    // Geração de Relatórios
    public void gerarRelatorio() {
        System.out.println("Relatório de Estoque:");
        for (Produto produto : produtos) {
            System.out.println(produto);
            if (produto.getQuantidade() <= 5) {
                System.out.println("Atenção: estoque baixo para o produto " + produto.getNome());
            } else if (produto.getQuantidade() > 100) {
                System.out.println("Atenção: excesso de estoque para o produto " + produto.getNome());
            }
        }
    }
}
