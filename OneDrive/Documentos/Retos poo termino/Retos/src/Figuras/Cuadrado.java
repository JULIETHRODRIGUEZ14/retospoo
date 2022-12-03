package Figuras;

public class Cuadrado extends Figura{

    //Atributos
    private float lado;

    //Metodos
    public Cuadrado() {

    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public void clacularArea() {

        float area = lado * lado;
        System.out.println("El area del cuadrado " + lado + " es" + area);
    }

}