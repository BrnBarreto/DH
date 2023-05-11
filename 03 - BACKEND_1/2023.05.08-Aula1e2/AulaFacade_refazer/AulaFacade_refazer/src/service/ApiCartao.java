package service;

import model.Cartão;

public class ApiCartao {

    int descontoCartao (Cartão cartao){
        if (cartao.getBanco().equals("Star Bank")){
            return 20;
        }else {
            return 0;
        }
    }
}
