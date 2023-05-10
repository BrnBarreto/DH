package model;

public abstract class Vendedores {

    int pontuacao;


    public String mostrarCategoria( int pontuacao){
        if (pontuacao > 40 ) {
            return "Vendedor categoria: Mestre";
        } else if ( pontuacao > 30 && pontuacao < 41) {
            return "Vendedor categoria: Bom";
        } else if (pontuacao > 19 && pontuacao < 31) {
            return "Vendedor categoria: Aprendiz";
        } else {
            return "Vendedor categoria: Novato";
        }
    }

    public abstract int vender();


}
