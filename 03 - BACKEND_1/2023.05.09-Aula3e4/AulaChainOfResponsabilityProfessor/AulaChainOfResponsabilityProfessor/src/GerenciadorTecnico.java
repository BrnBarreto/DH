import model.Email;

public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Email email) {
        if ((email.getDestinatario().equalsIgnoreCase("tecnico@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Tecnico"))) {
            System.out.println("Enviado ao departamento tecnico");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}
