package Interfaz;

public class Ejecucion {

    public static void main(String[] args) {
        Piedra_papel_tijera juego=new Piedra_papel_tijera();
        juego.iniciar();
        juego.jugar();
        juego.finalizar();

        Carisellazo juego1=new Carisellazo();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
    
    }
    
}
