package FigurasGeometricas;

public class Triangulo extends Figura {
    
    //Atributos

    float base;
    float altura;

    //Metodo constructor
     public Triangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
     }

     //Metodo accesores
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
        area=(base*altura)/2;

        System.out.println("La base del triangulo es: "+base);
        System.out.println();
        System.out.println("La altura del triangulo es: " +altura);
        System.out.println();
        System.out.println("El area del trinagulo es: " +area);
    }
      
     
}
