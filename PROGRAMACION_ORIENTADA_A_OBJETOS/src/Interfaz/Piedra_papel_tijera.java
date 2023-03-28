package Interfaz;

import java.util.Scanner;

public class Piedra_papel_tijera implements Juego {

    //Atributos
   
    private int numJugador;
    private int numMaquina;
    private String nombre;

    Scanner captura=new Scanner(System.in);

    public void iniciar() {
        System.out.println();
        System.out.println("Bienvenido al juego piedra, papel o tijera");
        System.out.println();
        System.out.println("Por favor digite su nombre");
        System.out.println();
        nombre=captura.next();
        System.out.println();
    }

    public void jugar() {
        System.out.println("si desea tirar piedra elija 1 ");
        System.out.println("Si desea tirar papel elija 2 ");
        System.out.println("Si desea tirar tijera elija 3 ");
        System.out.println();
        numJugador=captura.nextInt();
        System.out.println("La maquina eligio");
        numMaquina=(int) (Math.random()*3)+1;
    }

    public void finalizar() {
        System.out.println();
        if(numMaquina==1 && numJugador==1){
            System.out.println("Salio piedra han empatado");
        }
        else if(numMaquina==2 && numJugador==2){
            System.out.println("Salio papel han empatado");
        }
        else if(numMaquina==3 && numJugador==3){
            System.out.println("Salio tijera han empatado");
        }
        else if(numMaquina==1 && numJugador==2){
            System.out.println("Salio piedra ha ganado "+ nombre);
        }
        else if(numMaquina==1 && numJugador==3){
            System.out.println("Salio piedra ha perdido"+ nombre +" gano la maquina");
        }
        else if(numMaquina==2 && numJugador==1){
            System.out.println("Salio papel ha perdido "+ nombre +" gano la maquina");
        }
        else if(numMaquina==2 && numJugador==3){
            System.out.println("Salio papel ha ganado "+ nombre);
        }
        else if(numMaquina==3 && numJugador==1){
            System.out.println("Salio piedra ha ganado "+ nombre);
        }
        else if(numMaquina==3 && numJugador==2){
            System.out.println("Salio piedra ha perdido "+ nombre +" gano la maquina");
        }
         
        System.out.println();
        System.out.println("¡¡Gracias por jugar!!");
        System.out.println();

    }
    
    
}
