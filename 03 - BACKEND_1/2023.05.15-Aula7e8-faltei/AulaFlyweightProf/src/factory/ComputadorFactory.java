package factory;

import model.Computador;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    private static Map<String, Computador> mapFlyweight = new HashMap<>();

    public Computador getComputador (int ram, int hd) {

        String id = "id: " + ram + ":" + hd;
        System.out.println(id);

        if (!mapFlyweight.containsKey(id)) {
            Computador computador = new Computador(ram, hd);
            System.out.println("Novo computador criado!");
            mapFlyweight.put(id, computador);
            return mapFlyweight.get(id);
        }

        System.out.println("Computar encontrado!");

        return mapFlyweight.get(id);
    }

}
