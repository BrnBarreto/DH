import model.Contratado;
import model.Efetivo;
import model.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Efetivo("Bruno", "Barreto","123456",6029,1339,2349);
        funcionario.pagamentoSalario();

        Funcionario funcionario2 = new Contratado("Murilo", "Barreto", "123555", 55,80);
        funcionario2.pagamentoSalario();


    }
}