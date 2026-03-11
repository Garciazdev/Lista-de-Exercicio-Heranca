package Exercicio6Loja;

public class Produto {
    private String nomeProduto;
    private double preco;


    public Produto (){

    }
    public Produto (String nomeProduto, double preco){
    this.nomeProduto= nomeProduto;
    this.preco=preco;
    }

    public String getNomeProduto() {

        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {

        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        if(preco <= 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        return preco;

    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String exibirProduto() {
        return "Produto: " +
            "\n"+"nomeProduto= " + getNomeProduto() +
                "\n"+"preco= " +  getPreco()
                ;
    }
}
