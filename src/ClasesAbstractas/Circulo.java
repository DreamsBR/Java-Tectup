package ClasesAbstractas;

public class Circulo  extends Figura{

    private static double pi = 3.1416;

    private float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return pi * (radio*radio);
    }

    @Override
    public double perimetro() {
        return 2 * pi *radio;
    }

    @Override
    public void printColor(){
        System.out.println("El color del circulo es :" + color);
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circulo.pi = pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
