package service;

public class ApiQuantidade {

    int descontoQuantidade (int quantidade){
        if (quantidade > 12){
            return 15;
        }else {
            return 0;
        }
    }
}
