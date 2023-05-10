package service;

import model.Cartao;

public class ApiCartao {

    int descontoCartao(Cartao cartao) {
        if (cartao.getBanco().equals("Star Bank")) {
            return 20;
        } else {
            return 0;
        }
    }
}
