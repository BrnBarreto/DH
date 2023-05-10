import model.Email;

public class Main {
    public static void main(String[] args) {

        CheckMail processa = new CheckMail();
        processa.verificador(new Email("email@colmeia.com", "tecnico@email.com", "Aula 4"));
        processa.verificador(new Email("email@colmeia.com", "email@email.com", "Gerencial"));
        processa.verificador(new Email("email@colmeia.com", "tecnico@email.com", "Tecnico"));
        processa.verificador(new Email("email@colmeia.com", "comercial@colmeia.com", "Aula 4"));
    }
}