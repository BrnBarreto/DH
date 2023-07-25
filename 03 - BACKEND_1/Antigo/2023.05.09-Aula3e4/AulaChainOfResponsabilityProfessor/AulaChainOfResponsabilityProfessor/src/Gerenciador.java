import model.Email;

public abstract class Gerenciador {

    private Gerenciador gerenciadorSeguinte;

    public abstract void verificar(Email email);

    public Gerenciador getGerenciadorSeguinte() {
        return gerenciadorSeguinte;
    }

    public void setGerenciadorSeguinte(Gerenciador gerenciadorSeguinte) {
        this.gerenciadorSeguinte = gerenciadorSeguinte;
    }
}
