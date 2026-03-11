package Exercicio2Funcionario;

public class Desevolvedor extends Funcionario{

    public Desevolvedor(){
        super();
    }
    public Desevolvedor(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public double calcularBonus() {
        double bonus = (getSalario()*0.10);
        return bonus;
    }
}
