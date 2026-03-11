package Exercicio4ContaBancaria;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(int numConta,double saldo){
        super(numConta,saldo);
    }

    public double rendimento(){
        double rendimento = getSaldo()*0.005;
        return rendimento;
    }
}
