import model.Usuario;
import service.ProxyDownload;

public class Main {
    public static void main(String[] args) {

        ProxyDownload proxyDownload = new ProxyDownload();
        Usuario u1 = new Usuario("123","Premium");
        proxyDownload.baixarMusica(u1.getIdentificador(), u1.getCategoria());


    }
}