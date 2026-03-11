package Exercicio6Loja;

public class Eletronico extends Produto {
  private int garantia;
    public Eletronico(){
        super();
    }
    public Eletronico(String nomeProduto,double preco,int garantia){
        super(nomeProduto,preco);
        this.garantia=garantia;

    }

    public int getGarantia() {
        return garantia;

    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String exibirProduto() {
        return super.exibirProduto()+"\n"+"Garantia: "+ getGarantia()+" Meses";
    }
}
