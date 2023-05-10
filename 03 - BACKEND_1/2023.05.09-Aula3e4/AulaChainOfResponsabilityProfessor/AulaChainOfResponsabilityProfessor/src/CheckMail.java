import model.Email;

public class CheckMail {

    public Gerenciador inicial;

    public CheckMail() {

        this.inicial = new GerenciadorGerencial();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnico);
        tecnico.setGerenciadorSeguinte(spam);
    }

    public void verificador(Email email) {
        inicial.verificar(email);
    }

}
