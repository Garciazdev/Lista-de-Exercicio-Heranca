package Exercicio4ContaBancaria;

public class ContaCorrente extends Conta {
    private double taxaDeSaque = 10;

    public ContaCorrente(){
        super();
    }
    public ContaCorrente(int numConta,double saldo){
        super(numConta,saldo);
    }

    @Override
    public double sacar(double Valorsaque) {
        taxaDeSaque= Valorsaque-(taxaDeSaque/100);
          return super.sacar(Valorsaque)+taxaDeSaque;

    }
}
//