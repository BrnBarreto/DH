package model;

public class Adulto extends Menu{
    public Adulto(double preco, String tipo, int quantidade) {
        super(preco, tipo, quantidade);
    }


    @Override
    public void montar() {
        System.out.println("Prato"+getTipo()+" com "+ getQuantidade()+" Unidades");

    }
}
