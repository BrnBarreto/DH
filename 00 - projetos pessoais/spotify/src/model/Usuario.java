package model;

public class Usuario {

    private String identificador;
    private String categoria;

    public Usuario(String identificador, String categoria) {
        this.identificador = identificador;
        this.categoria = categoria;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
