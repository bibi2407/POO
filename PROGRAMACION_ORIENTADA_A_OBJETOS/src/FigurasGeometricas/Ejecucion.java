package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {
        float lado,base,altura,radio,pi;
        int figura;

        Scanner captura=new Scanner(System.in);

        System.out.println("Elija la figura para saber su area correspondiente: ");
        System.out.println("1 Cuadrado");
        System.out.println("2 Rectangulo");
        System.out.println("3 Circulo");
        System.out.println("4 Triangulo");
        System.out.println();
        System.out.println("Que figura elige: ");
        figura=captura.nextInt();

        if(figura==1){

            System.out.println("Por favor digite el lado del cuadrado: ");
            lado=captura.nextFloat();
            System.out.println();
            Cuadrado cuadrado1=new Cuadrado(lado);
            cuadrado1.calcularArea();
        }
        else if(figura==2){

            System.out.println("Por favor digite la base del rectangulo: ");
            base=captura.nextFloat();

            System.out.println("Por favor digite la altura del rectangulo: ");
            altura=captura.nextFloat();
            System.out.println();
            Rectangulo rec1=new Rectangulo(base,altura);
            rec1.calcularArea();
        }
        else if(figura==3){

            System.out.println("Por favor digite la radio del circulo: ");
            radio=captura.nextFloat();

            System.out.println("Por favor digite pi: ");
            pi=captura.nextFloat();
            System.out.println();
            Circulo circu1=new Circulo(radio, pi);
            circu1.calcularArea();
        }
        else if(figura==4){

            System.out.println("Por favor digite la base del triangulo: ");
            base=captura.nextFloat();

            System.out.println("Por favor digite la altura del triangulo: ");
            altura=captura.nextFloat();
            System.out.println();
            Triangulo tri1=new Triangulo(base, altura);
            tri1.calcularArea();
        }

        captura.close();


    }
    
}
