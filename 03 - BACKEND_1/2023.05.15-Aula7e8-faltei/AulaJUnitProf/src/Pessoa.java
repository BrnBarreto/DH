import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;

    private LocalDate idade;

    private static List<Pessoa> colecao = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public static List<Pessoa> getColecao() {
        return colecao;
    }

    public static void setColecao(List<Pessoa> colecao) {
        Pessoa.colecao = colecao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public int calcularIdade() {
        int idade = Period.between(this.idade, LocalDate.of(2023, 05, 15)).getYears();
        return idade;
    }

    public List<Pessoa> adicionarNome(Pessoa pessoa) {

        if (pessoa.getNome().length() >= 5 && pessoa.calcularIdade() >= 18) {
            colecao.add(pessoa);
            System.out.println("Lista de pessoas que satisfazem as duas condicoes: " + colecao);
        }
        return colecao;
    }
}
