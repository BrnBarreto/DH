import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ciro");
        p1.setIdade(LocalDate.of(2016,3,23));
        p2 = new Pessoa("Ciro");
        p2.setIdade(LocalDate.of(2016,3,23));
        p3 = new Pessoa("Ciro");
        p3.setIdade(LocalDate.of(2016,3,23));
        p4 = new Pessoa("Ciro");
        p4.setIdade(LocalDate.of(2016,3,23));
        p5 = new Pessoa("Ciro");
        p5.setIdade(LocalDate.of(2016,3,23));
        p6 = new Pessoa("Carlos");
        p6.setIdade(LocalDate.of(2000,3,23));
        p7 = new Pessoa("Carlos");
        p7.setIdade(LocalDate.of(2010,3,23));
        p8 = new Pessoa("Carlos");
        p8.setIdade(LocalDate.of(2015,3,23));
        p9 = new Pessoa("Carlos");
        p9.setIdade(LocalDate.of(1975,3,23));
        p10 = new Pessoa("Carlos");
        p10.setIdade(LocalDate.of(2014,3,23));
    }

    @Test
    void imprimir() {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void deveTestarAdicaoDeNomesQueSatisfazemACondicao() {
        p1.adicionarNome(p1);
        p2.adicionarNome(p2);
        p3.adicionarNome(p3);
        p4.adicionarNome(p4);
        p5.adicionarNome(p5);
        p6.adicionarNome(p6);
        p7.adicionarNome(p7);
        p8.adicionarNome(p8);
        p9.adicionarNome(p9);
        p10.adicionarNome(p10);

        Assertions.assertEquals(Pessoa.getColecao().size() == 2, true);
    }

}
