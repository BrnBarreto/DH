package service;

public class ServicoDownload implements IDowload {
    @Override
    public void baixarMusica(String identificador, String tipo) {
        System.out.println("Musica chegando ... Você é um usuário tipo: " + tipo );
    }
}
