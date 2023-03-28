package FigurasGeometricas;

public class Cuadrado extends Figura {

    //Atributos
    float lado;

    //Metodo constructor
    public Cuadrado(float lado){
        this.lado= lado;
    }

    //Metodo accesores 

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    //Metodo propio
    public void calcularArea(){
        float area;
        area=lado*lado;

        System.out.println("El lado del cuadrado es: "+lado);
        System.out.println();
        System.out.println("El area del cuadrado es: " +area);
    }

   
}
