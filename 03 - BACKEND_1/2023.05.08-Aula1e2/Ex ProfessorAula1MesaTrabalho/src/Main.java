import model.Viagem;
import service.FacadeTurismoImpl;

public class Main {
    public static void main(String[] args) {

        FacadeTurismoImpl cliente = new FacadeTurismoImpl();

        Viagem viagem1 = new Viagem("02/07/2018", "08/04/2018", "Sao Paulo", "Bahia");

        viagem1 = cliente.buscar(viagem1);

        System.out.println("======================================");
        System.out.println("Voos encontrados para " + viagem1.getDestino() + " desde " + viagem1.getOrigem());
        System.out.println("Data ida: " + viagem1.getDataPartida() + ". Data Volta: " + viagem1.getDataRetorno());
        System.out.println("Linha aerea disponivel: " + viagem1.getLinhaAerea());
        System.out.println(".........");
        System.out.println("Hoteis encontrados: " + viagem1.getOrigem());
        System.out.println("Entrada: " + viagem1.getDataPartida() + " Saida: " + viagem1.getDataRetorno());
        System.out.println("Hotel disponivel: " + viagem1.getHotel());
        System.out.println("======================================");
    }
}