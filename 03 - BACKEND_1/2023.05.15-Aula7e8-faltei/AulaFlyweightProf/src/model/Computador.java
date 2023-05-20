package model;

public class Computador {

    private int hd;

    private int ram;

    private static int contador;

    public Computador(int hd, int ram) {
        this.hd = hd;
        this.ram = ram;
        contador++;
        System.out.println("nova instancia (objeto): " + contador);
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "model.Computador{" +
                "hd=" + hd +
                ", ram=" + ram +
                '}';
    }
}
