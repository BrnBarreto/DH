package com.dh.model;

public class Filial {

    private int Id;
    private String nomeFilial;

    private String numero;

    private String cidade;

    private String estado;

    private String ehCincoEstrelas;

    public Filial(String nomeFilial, String numero, String cidade, String estado, String ehCincoEstrelas) {
        this.nomeFilial = nomeFilial;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.ehCincoEstrelas = ehCincoEstrelas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEhCincoEstrelas() {
        return ehCincoEstrelas;
    }

    public void setEhCincoEstrelas(String ehCincoEstrelas) {
        this.ehCincoEstrelas = ehCincoEstrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "Id=" + Id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", ehCincoEstrelas='" + ehCincoEstrelas + '\'' +
                '}';
    }
}
