package Exercicio7Desafio;

public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente("Erik","abublé@gmail.com");
        System.out.println(cliente);
        System.out.println("_________________");
        cliente.addCompra(new Compra("teclado",200));
        cliente.addCompra(new Compra("mouse",200));
        cliente.addCompra(new Compra("monitor",200));
        cliente.addCompra(new Compra("microfone",200));
        cliente.historicoCompras();
        System.out.println("\n");
        Administrador administrador = new Administrador("Garciadev","pah@gmail.com",3);
        System.out.println(administrador);
    }
}
