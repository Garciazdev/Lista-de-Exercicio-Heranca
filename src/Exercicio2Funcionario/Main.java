package Exercicio2Funcionario;

public class Main {
    public static void main(String[] args) {
        System.out.println("GERENTE: ");
        Gerente gerente = new Gerente("Erik",2300);
        System.out.println("Bonus de: "+gerente.calcularBonus());
        System.out.println("\n"+"_____________________________________");

        System.out.println("Desenvolvedor: ");
        Desevolvedor desevolvedor = new Desevolvedor("Joao",2200);
        System.out.println("Bonus de: "+desevolvedor.calcularBonus());
    }
}
