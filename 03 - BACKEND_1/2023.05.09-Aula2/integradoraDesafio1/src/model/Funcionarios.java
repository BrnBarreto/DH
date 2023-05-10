package model;

public class Funcionarios extends Vendedor {
    public Funcionarios(String nome, String tipoVendedor) {
        super(nome, tipoVendedor);
    }

    @Override
    public int pontuar(String tipoVenda) {
        if (tipoVenda == "Venda") {
            return 10;
        } else if (tipoVenda == "obterFiliado") {
            return 5;
        }


        @Override
        public String mostrarCategoria() {

        }

    }
}
