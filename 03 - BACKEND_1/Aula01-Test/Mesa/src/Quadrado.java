public class Quadrado extends Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calucarPerimetroQuadrado() {
        return this.lado*this.lado*this.lado*this.lado;
    }
}
