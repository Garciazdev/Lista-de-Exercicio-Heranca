package Exercicio5SistemaDeAnimais;

public class Gato extends Animal{

    public Gato(){
        super();
    }
    public Gato(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
}
