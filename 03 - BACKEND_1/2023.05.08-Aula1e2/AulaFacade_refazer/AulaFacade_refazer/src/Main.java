import model.Cartão;
import model.Produto;
import service.FacadeDesconto;

public class Main {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartão cartao = new Cartão("12345", "Star bank");
        Produto produto = new Produto("milho", "Lata");
        System.out.println("Desconto: " + facadeDesconto.desconto(cartao,produto,10));

    }
}