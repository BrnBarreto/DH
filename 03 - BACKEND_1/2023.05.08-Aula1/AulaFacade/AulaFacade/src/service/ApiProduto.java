package service;

import model.Produto;

public class ApiProduto {

    public int descontoProduto(Produto produto) {
        if (produto.getTipo().equals("Lata")) {
            return 10;
        } else {
            return 0;
        }
    }
}
