package Exercicio2Funcionario;

public class Gerente extends Funcionario {


    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {

        double bonus = (getSalario()*0.20);
        return bonus;
    }
}
