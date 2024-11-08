public class SistemaGerenciamentoEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Cadastro de produtos
        Produto produto1 = new Produto("Notebook", "Eletrônicos", 10, 2500.00, "A1");
        Produto produto2 = new Produto("Smartphone", "Eletrônicos", 3, 1500.00, "A2");
        Produto produto3 = new Produto("Cadeira Gamer", "Móveis", 150, 500.00, "B1");

        estoque.cadastrarProduto(produto1);
        estoque.cadastrarProduto(produto2);
        estoque.cadastrarProduto(produto3);

        // Atualização de estoque
        estoque.atualizarEstoque("Notebook", 5); // Adiciona 5 unidades de Notebook
        estoque.atualizarEstoque("Smartphone", -1); // Remove 1 unidade de Smartphone

        // Rastreamento de localização
        estoque.rastrearProduto("Cadeira Gamer");

        // Geração de relatório
        estoque.gerarRelatorio();
    }
}
