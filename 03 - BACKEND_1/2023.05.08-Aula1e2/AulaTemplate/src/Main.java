import model.Contratado;
import model.Efetivo;
import model.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Efetivo("Maria", "Alves", "123456",
                3000.0, 1000.0, 500.0);
        funcionario.pagamentoSalario();

        Funcionario funcionario2 = new Contratado("Ana", "Silva", "321654", 50.0, 50);
        funcionario2.pagamentoSalario();
    }
}