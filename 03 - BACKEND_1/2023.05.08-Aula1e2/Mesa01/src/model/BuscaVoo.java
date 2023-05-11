package model;

public class BuscaVoo {
 private String dataPartida;
 private String dataRetorno;
 private String origemCidade;
 private String destinoCidade;


    public BuscaVoo(String dataPartida, String dataRetorno, String origemCidade, String destinoCidade) {
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.origemCidade = origemCidade;
        this.destinoCidade = destinoCidade;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public String getOrigemCidade() {
        return origemCidade;
    }

    public String getDestinoCidade() {
        return destinoCidade;
    }
}
