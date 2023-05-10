package service;

public class VacinaServiceProxy implements IVacinar{

    @Override
    public void vacinarPessoa(String rg, String dataVacina, String nomeVacina, String dataAgendada) {
        if(dataVacina.equals(dataAgendada)) {
            VacinaService vacinaService = new VacinaService();
            vacinaService.vacinarPessoa(rg, dataVacina, nomeVacina, dataAgendada);
            System.out.println("Cidadao(a) foi vacinado(a) com sucesso!!!");
        } else {
            System.out.println("A data da aplicação (" + dataVacina + ") eh anterior a data marcada ("
                    + dataAgendada + "), por isso a vacina não pode ser aplicada!");
        }
    }
}
