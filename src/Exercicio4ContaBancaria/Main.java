package Exercicio4ContaBancaria;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conta corrente: ");
        ContaCorrente contaCorrente = new ContaCorrente(2323232,2500);
        System.out.println("Novo saldo: "+contaCorrente.depositar(20));
        System.out.println("Saque realizado com sucesso! "+contaCorrente.sacar(200));
        System.out.println("\n"+"_________________________________________");

        ContaPoupanca contaPoupanca = new ContaPoupanca(212121,2400);
        System.out.println("Deposito realizado com sucesso!"+"\n"+"Novo saldo: " +contaPoupanca.depositar(200));
        System.out.println("Saque realizado com sucesso!"+"\n"+"Novo saldo: "+contaPoupanca.sacar(500));
        System.out.println("Rendimento: "+contaPoupanca.rendimento()+" por mês");
    }
}
