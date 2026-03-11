package Exercicio3Veiculo;

public class Moto extends Veiculo {
    private int cilindradas;
    public Moto(){
        super();
    }

    public Moto(String marca, String modelo, int ano,int cilindradas){
        super(marca,modelo,ano);
        this.cilindradas=cilindradas;
       if(cilindradas<=0){
           throw new IllegalArgumentException("Valor de Cilindrada invalido");
       }
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString()+"Cilindradas: "+getCilindradas()+"CC";
    }
}
