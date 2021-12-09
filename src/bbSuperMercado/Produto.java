package bbSuperMercado;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private int quantidadeEstoque;
    private int quantidadeCompraTotal = 0;
    private int quantidadeCompraAtual = 0;
    private float precoUni;

    public Produto(String nome, int quantidadeEstoque, float precoUni) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoUni = precoUni;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", estoque=" + (quantidadeEstoque) +
                ", preco(un)=" + precoUni +
                '}';
    }
    
    public int getQuantidadeCompraAtual(){
        return quantidadeCompraAtual;
    }
    
    public void setQuantidadeCompraAtual(int quantidadeCompraAtual){
        this.quantidadeCompraAtual = quantidadeCompraAtual;
    }
    
    public String getNome() {
        return nome;
    }

    public void setQuantidadeCompraTotal(int quantidadeCompraTotal) {
        this.quantidadeCompraTotal = quantidadeCompraTotal;
    }

    public int getQuantidadeCompraTotal() {
        return quantidadeCompraTotal;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPrecoUni() {
        return precoUni;
    }
}