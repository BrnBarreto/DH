import model.Cartao;
import model.Produto;
import service.FacadeDesconto;

public class Main {
    public static void main(String[] args) {
        FacadeDesconto facade = new FacadeDesconto();
        Cartao cartao = new Cartao("123456", "Star Bank");
        Produto produto = new Produto("milho", "Lata");
        System.out.println("Desconto: " + facade.desconto(cartao, produto, 10));;
    }
}