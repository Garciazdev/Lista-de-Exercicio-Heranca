package Exercicio3Veiculo;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(){

    }
    public Veiculo(String marca,String modelo,int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Veiculo: " +
                "\n"+"ano= " + ano +
                "\n"+"marca= " + marca +
                "\n"+"modelo= " + modelo + "\n";
    }
}
