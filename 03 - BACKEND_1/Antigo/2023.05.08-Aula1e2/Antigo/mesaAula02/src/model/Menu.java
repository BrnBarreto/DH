package model;

public abstract class Menu {

    private double preco;

    private String tipo;

    private int quantidade;

    public Menu(double preco, String tipo, int quantidade) {
        this.preco = preco;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public String entragaPedido(){
        montar();
        cacularPrecoVenda();
        return " Com o preço de: "+ cacularPrecoVenda();
    }

    public abstract void montar();

    public double cacularPrecoVenda(){
        double valor = getQuantidade()*getPreco();
        return valor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
