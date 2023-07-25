public abstract class  Figura {

    private double perimetro;

    public String mostrarPerimetro(double perimetro){
        return "O Perimetro é: "+perimetro;
    }

    public abstract double calcularPerimetroCirculo();
    public abstract double calucarPerimetroQuadrado();

}
