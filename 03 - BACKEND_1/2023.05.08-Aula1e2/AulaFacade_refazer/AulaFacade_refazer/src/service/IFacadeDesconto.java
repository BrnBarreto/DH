package service;

import model.Cartão;
import model.Produto;
public interface IFacadeDesconto {

   int desconto(Cartão cartão, Produto produto, int quantidade);


}
