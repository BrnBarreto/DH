package service;

import model.Cartao;
import model.Produto;

public class FacadeDesconto implements IFacadeDesconto{

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto() {
        this.apiCartao = new ApiCartao();
        this.apiProduto = new ApiProduto();
        this.apiQuantidade = new ApiQuantidade();
    }

    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade) {
        int desconto = 0;
        desconto = desconto + apiCartao.descontoCartao(cartao);
        desconto = desconto + apiProduto.descontoProduto(produto);
        desconto = desconto + apiQuantidade.descontoQuantidade(quantidade);
        return desconto;
    }
}
