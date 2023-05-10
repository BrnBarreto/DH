import model.Afiliado;
import model.Funcionarios;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios(3);
        funcionarios.calcularTempo(funcionarios.getTempoEmpresa());
        funcionarios.obterAfiliado();
        funcionarios.obterAfiliado();
        funcionarios.vender();
        funcionarios.vender();


        System.out.println( funcionarios.mostrarCategoria(funcionarios.getPontuacao()) + " - "+ funcionarios.getPontuacao() + " pontos");


        Afiliado afiliado = new Afiliado();
        afiliado.vender();
        afiliado.vender();

        System.out.println( afiliado.mostrarCategoria(afiliado.getPontuacao()) + " - "+ afiliado.getPontuacao() + " pontos");

    }
}