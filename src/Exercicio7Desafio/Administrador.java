package Exercicio7Desafio;

public class Administrador extends Usuario {
    private int nivelDeAcesso;
    public Administrador(){
        super();
    }
    public Administrador(String nome,String email, int nivelDeAcesso){
        super(nome,email);
        this.nivelDeAcesso=nivelDeAcesso;

    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Nivel de acesso: "+getNivelDeAcesso();
    }
}
