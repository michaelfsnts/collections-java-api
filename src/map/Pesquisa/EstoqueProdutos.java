package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        if(!produtosMap.isEmpty()){
            System.out.println(produtosMap);
        }else{
            System.out.println("O map está vázio!");
        }
    }
    public double calcularValorTotalEstoque(){
        double totalEstoque = 0;
        if(!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){
                totalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return totalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){
                if(p.getPreco() > maiorValor){
                    produtoCaro = p;
                }
            }
        }
        return produtoCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoBarato = null;
        double menorValor = Double.MAX_VALUE;
        if(!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){
                if(p.getPreco() < menorValor){
                    produtoBarato= p;
                }
            }
        }
        return produtoBarato;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}