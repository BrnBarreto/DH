package model;

public abstract class Vendedor {

    private String nome;
    private String tipoVendedor;

    public Vendedor(String nome, String tipoVendedor) {
        this.nome = nome;
        this.tipoVendedor = tipoVendedor;
    }


    public abstract int pontuar(String tipoVenda);

    public abstract String mostrarCategoria();




}
