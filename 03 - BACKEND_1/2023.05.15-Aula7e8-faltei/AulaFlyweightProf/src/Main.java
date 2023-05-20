import factory.ComputadorFactory;
import model.Computador;

public class Main {
    public static void main(String[] args) {

        ComputadorFactory computadorFactory = new ComputadorFactory();

        Computador mac = computadorFactory.getComputador(8, 500);
        Computador windows1 = computadorFactory.getComputador(16, 128);
        Computador windows2 = computadorFactory.getComputador(16, 128);

        System.out.println(mac.toString());
        System.out.println(windows2.toString());
        System.out.println(windows1.toString());

    }
}