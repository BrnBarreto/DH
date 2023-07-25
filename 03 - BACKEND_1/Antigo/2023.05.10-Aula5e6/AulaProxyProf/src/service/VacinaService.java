package service;

public class VacinaService implements IVacinar {

    @Override
    public void vacinarPessoa(String rg, String dataVacina, String nomeVacina, String dataAgendada) {
        System.out.println("Usuario(a) com o RG: " + rg + ", foi vacinado(a) em: " + dataVacina + " com sucesso!");
    }
}
