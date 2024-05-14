package set.desafios.ordenacao;

import java.util.*;

public class CadastroProdutos {
    private Set<Produto> carrinhoCompras;

    public CadastroProdutos() {
        this.carrinhoCompras = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(carrinhoCompras);
        if (!carrinhoCompras.isEmpty()) {
            return produtosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!carrinhoCompras.isEmpty()) {
            produtosPorPreco.addAll(carrinhoCompras);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "carrinhoCompras=" + carrinhoCompras +
                '}';
    }
}
