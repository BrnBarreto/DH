package model;

public abstract class Funcionario {

    private String nome;

    private String sobreNome;

    private String numeroConta;

    public Funcionario(String nome, String sobreNome, String numeroConta) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.numeroConta = numeroConta;
    }

    public abstract double calcularsalario();

    public abstract void imprimirRecibo(double quantia);

    public void depositar(double quantia){
        System.out.println("Foi depositado uma quantia de " + quantia);
    }

    public void pagamentoSalario(){
        double quantia;
        quantia = calcularsalario();
        imprimirRecibo(quantia);
        depositar(quantia);
    }
}
