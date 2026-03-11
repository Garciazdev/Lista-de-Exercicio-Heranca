package Exercicio3Veiculo;

public class Carro extends Veiculo {
    private int quantidadePorta;
    public Carro(){
        super();
    }
    public Carro(String marca,String modelo,int ano,int quantidadePorta){
        super(marca,modelo,ano);
        this.quantidadePorta=quantidadePorta;
        if(quantidadePorta<=0){
            throw new IllegalArgumentException("Quantidade de portas invalido");
        }

    }

    public int getQuantidadePorta() {
        return quantidadePorta;
    }

    public void setQuantidadePorta(int quantidadePorta) {
        this.quantidadePorta = quantidadePorta;
    }


    @Override
    public String toString() {
        return super.toString()+"Quantidades de Portas: "+getQuantidadePorta();
    }
}
