package Exercicio6Loja;

public class Main {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico("TV",2,12);
        System.out.println(eletronico.exibirProduto());
        System.out.println("_____________________________________________");
        Alimento alimento = new Alimento("Maçã",0,"20/11/2028");
        System.out.println(alimento.exibirProduto());
    }
}
