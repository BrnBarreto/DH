package model;

public class Email {

    private String origem;
    private String destinatario;
    private String assunto;

    public Email(String origem, String destinatario, String assunto) {
        this.origem = origem;
        this.destinatario = destinatario;
        this.assunto = assunto;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
