package ClasesAbstractas;

public class Circulo  extends Figura{

    private static float pi = 3.1416F;

    private float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public float area() {
        return pi * (radio*radio);
    }

    @Override
    public float perimetro() {
        return 2 * pi *radio;
    }

    @Override
    public void printColor(){
        System.out.println("El color del circulo es :" + color);
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(float pi) {
        Circulo.pi = pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
