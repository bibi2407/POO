package Interfaz;

import java.util.Scanner;

public class Carisellazo implements Juego  {
    
     //Atributos
     private int numJugador;
     private int dado;
     private String nombre;

     Scanner captura=new Scanner(System.in);

   
    public void iniciar() {
        System.out.println();
        System.out.println("Bienvenido al juego de carisellazo");
        System.out.println();
        System.out.println("Por favor digite su nombre");
        System.out.println();
        nombre=captura.nextLine();
        System.out.println();
        
    }

    
    public void jugar() {
        System.out.println("Si desea escojer cara digite 1 pero si desea escojer sello digite 2");
        numJugador=captura.nextInt();
        System.out.println();
        System.out.println("La moneda cayo y  ");
        System.out.println();
        dado=(int) (Math.random()*2)+1;
    }


    public void finalizar() {
        if(dado==1 && numJugador==1){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador +  " salio cara han empatado ");
        }
        else if(dado==2 && numJugador==2){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador + " salio sello has ganado  "  );
        }
        else if(dado==1 && numJugador==2){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador + " salio cara ha perdido " );
        }
        else if(dado==2 && numJugador==1){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador +" salio sello ha perdido  ");
        
        }
         
        System.out.println();
        System.out.println("¡¡Gracias por jugar!!");
        System.out.println();
    }

     
}
