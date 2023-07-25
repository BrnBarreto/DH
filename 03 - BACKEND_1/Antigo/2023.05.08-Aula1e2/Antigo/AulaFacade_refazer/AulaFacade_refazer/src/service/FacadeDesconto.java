package service;

import model.Cartão;
import model.Produto;


public class FacadeDesconto implements IFacadeDesconto{


    private ApiCartao apiCartao;
    private ApiProduto apiProduto;

    private ApiQuantidade apiQuantidade;


    public FacadeDesconto(){
        this.apiCartao = new ApiCartao();
        this.apiProduto = new ApiProduto();
        this.apiQuantidade = new ApiQuantidade();
    }


    @Override
    public int desconto(Cartão cartão, Produto produto, int quantidade) {
        int desconto = 0;
        desconto = desconto + apiCartao.descontoCartao(cartão);
        desconto = desconto + apiQuantidade.descontoQuantidade(quantidade);
        desconto = desconto + apiProduto.descontoProduto(produto);
        return desconto;
    }
}
