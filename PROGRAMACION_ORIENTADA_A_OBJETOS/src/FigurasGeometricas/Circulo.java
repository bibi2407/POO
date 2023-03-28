package FigurasGeometricas;

public class Circulo extends Figura {

    //Atributos

    float pi;
    float radio;

    //Metodo constructor 

    public Circulo(float pi, float radio){
        this.pi= pi;
        this.radio= radio;
    }

    //Metodos accesores

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //Metodo propio

    public void calcularArea(){
        float area;
        
        area=pi*(radio*radio);

        System.out.println("Pi de un circulo es: "+pi);
        System.out.println();
        System.out.println("La radio del circulo  es: " +radio);
        System.out.println();
        System.out.println("El area del circulo es: " +area);
    }

    
    
}
