package Exercicio7Desafio;

public class Compra {
    private String produto;
    private double preco;

    public Compra(String produto,double preco){
        this.produto=produto;
        this.preco=preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
