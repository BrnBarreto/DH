package model;
public class Contratado extends Funcionario{

    private double valorHora;

    private int hrs;


    public Contratado(String nome, String sobreNome, String numeroConta,double valorHora, int hrs ) {
        super(nome, sobreNome, numeroConta);
        this.valorHora = valorHora;
        this.hrs = hrs;
    }



    @Override
    public double calcularsalario() {
        return valorHora*hrs;
    }

    @Override
    public void imprimirRecibo(double quantia) {

        System.out.println("Gerado um recibo - PJ no valor de: " + quantia);
    }


}
