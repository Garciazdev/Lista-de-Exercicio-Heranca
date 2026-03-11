package Exercicio1Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Erik", 22);
        System.out.println(pessoa.exibirDados());

       Aluno aluno = new Aluno("João",20,45000);
        System.out.println(aluno.exibirDados());

        Professor professor = new Professor("Roveri",42,"Português");
        System.out.println(professor.exibirDados());

    }

}