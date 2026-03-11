package Exercicio5SistemaDeAnimais;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Alfred",2);
        System.out.println("Gato: "+gato.getNome());
        System.out.println(gato.emitirSom());


        Cachorro cachorro=new Cachorro("Rufus",3);
        System.out.println("Cachorro: "+cachorro.getNome());
        System.out.println(cachorro.emitirSom());
    }
}
