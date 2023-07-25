import model.Pessoa;
import service.VacinaServiceProxy;

public class Main {
    public static void main(String[] args) {

        VacinaServiceProxy proxy = new VacinaServiceProxy();

        Pessoa p1 = new Pessoa("Maria", "Alves", "123456798", "12/02/2023", "Pfizer");
        proxy.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina(), "13/02/2023");


    }
}