package model;

public class Funcionarios extends Vendedores{

    int pontuacao = 0;
    int tempoEmpresa;

    public Funcionarios(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public int obterAfiliado() {

        int novoAfiliado = 10;

        pontuacao += novoAfiliado;

        return pontuacao;
    }

    public int calcularTempo (int  tempoEmpresa){
        int antiguidade = 5;
        int total = antiguidade * tempoEmpresa;

        pontuacao += total;
        return pontuacao;
    }



    @Override
    public int vender() {
        int novaVenda = 5;

        pontuacao += novaVenda;

        return pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }
}
