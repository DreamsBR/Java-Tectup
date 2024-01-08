package ClasesAbstractas;

public class Cuadrado extends Figura{

    private float lado;

    public Cuadrado(String color, float lado){
        super(color);
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado*lado;
    }

    @Override
    public double perimetro(){
        return 4*lado;
    }

    @Override
    public void printColor(){
        System.out.println("El color es : "+color);
    }

}