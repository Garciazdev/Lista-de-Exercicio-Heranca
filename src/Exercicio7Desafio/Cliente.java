package Exercicio7Desafio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<Compra> compras = new ArrayList<>();

    public Cliente(){
        super();
    }

    public Cliente(String nome, String email){
        super(nome,email);
    }
    public void addCompra(Compra compra){
        compras.add(compra);
    }
    public void historicoCompras(){
        double valorTotal = 0;
        for(Compra compra : compras){
            System.out.println("Produto: "+compra.getProduto());
            System.out.println("Preço: R$"+compra.getPreco());
            valorTotal+= compra.getPreco();
            System.out.println("--------------------");


        }
        System.out.println("Valor Total: R$ "+valorTotal);
        System.out.println("______________________");

    }


}
