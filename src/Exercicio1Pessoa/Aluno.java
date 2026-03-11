package Exercicio1Pessoa;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(){
        super();
    }
    public Aluno(String nome, int idade,int matricula){
        super(nome,idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados()+" ,Matricula: "+getMatricula();
    }
}
