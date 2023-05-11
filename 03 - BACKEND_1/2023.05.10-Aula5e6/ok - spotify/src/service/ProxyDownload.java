package service;

public class ProxyDownload implements IDowload{
    @Override
    public void baixarMusica(String identificador, String tipo) {
        if (tipo == "Premium"){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.baixarMusica(identificador, tipo);
            System.out.println("Musica foi baixada com sucesso");
        }else {
            System.out.println("Usuário não possui a conta premium");
        }
    }
}
