package FigurasGeometricas;

public class Rectangulo extends Figura {

    //Atributos

    float base;
    float altura;

    //Metodo constructor

    public Rectangulo(float base, float altura){

        this.base=base;
        this.altura=altura;
    }

  //Metodos accesores
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
 //Metodo propio
    public void calcularArea(){
        float area;
        area=base*altura;

        System.out.println("La base del rectangulo es: "+base);
        System.out.println();
        System.out.println("La altura del rectangulo es: " +altura);
        System.out.println();
        System.out.println("El area del rectangulo es: " +area);
    }
}
