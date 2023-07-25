import model.Email;

public class GerenciadorGerencial extends Gerenciador{

    @Override
    public void verificar(Email email) {
        if ((email.getDestinatario().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Gerencial"))) {
            System.out.println("Enviado ao departamento gerencial");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}
