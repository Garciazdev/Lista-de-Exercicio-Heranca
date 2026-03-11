package Exercicio6Loja;

public class Alimento extends Produto {
  private String validade;
    public Alimento(){
        super();
    }
    public Alimento(String nomeProduto, double preco, String validade){
        super(nomeProduto,preco);
        this.validade= validade;

    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public String exibirProduto() {
        return super.exibirProduto()+"\n"+"Validade: "+ getValidade();
    }
}
