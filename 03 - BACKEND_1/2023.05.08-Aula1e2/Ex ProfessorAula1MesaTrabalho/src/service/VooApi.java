package service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VooApi {

    public String buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
        List<String> linhasAereas = Arrays.asList("TAM", "Azul", "Gol");
        Random random = new Random();
        return linhasAereas.get(random.nextInt(linhasAereas.size()));
    }
}
