package Exercicio5SistemaDeAnimais;

public class Cachorro extends Animal{

    public Cachorro(){
        super();
    }
    public Cachorro(String nome,int idade){
        super(nome,idade);
    }

    @Override
    public String emitirSom() {
        return "Latido";
    }
}
