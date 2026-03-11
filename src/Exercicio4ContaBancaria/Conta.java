package Exercicio4ContaBancaria;

public class Conta {
    private int numConta;
    private double saldo;
    public Conta(){

    }
    public Conta(int numConta,double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valorDeposito){
        if(valorDeposito<=0){
            throw new IllegalArgumentException("Valor de Depósito invalido!");
        }
        saldo = getSaldo()+valorDeposito;
        return getSaldo();
    }
    public double sacar(double Valorsaque){
        if (Valorsaque>getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo = getSaldo()-Valorsaque;
        return saldo;
    }


}
