package model;

public class Efetivo extends Funcionario{

    private double salarioBase;

    private double desconto;

    private double bonificacao;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double desconto, double bonificacao) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacao - desconto;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo - Efetivo no valor de: " + quantia);
    }
}
