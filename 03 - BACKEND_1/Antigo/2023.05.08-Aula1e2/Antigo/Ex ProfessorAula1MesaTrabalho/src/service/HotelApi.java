package service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HotelApi {

    public String buscarHoteis(String dataEntrada, String dataSaida, String cidade) {
        List<String> hoteis = Arrays.asList("Hotel1", "Hotel2", "Hotel3");
        Random random = new Random();
        return hoteis.get(random.nextInt(hoteis.size()));
    }

}
