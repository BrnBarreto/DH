package model;

public class Afiliado extends  Vendedores{

    int pontuacao = 0;

    @Override
    public int vender() {
        int novaVenda = 15;

        pontuacao += novaVenda;

        return pontuacao;
    }




    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
