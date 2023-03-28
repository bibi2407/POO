package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;

public class Inicio {

    
    public static void main(String[] args) {

        double peso,estatura,pesoActual;
        
        String tipoDoc;
        int documento;
        String nombre,departamento;
        String apellido;
        String cargo;
        double valorHora;
        int horasTrabajadas;

        //crear un objeto ->Instancia de una clase
        
        Persona persona1=new Persona();
        //invocando el metodo
        persona1.pedirDatos();
        persona1.mostrarPersona();
        persona1.calcularImc();
        persona1.mayorEdad();

        //reto2
        Scanner captura=new Scanner(System.in);

        System.out.println("Por favor ingrese su peso");
        peso=captura.nextDouble();
        System.out.println("Por favor ingrese su estatura");
        estatura=captura.nextDouble();

        pesoActual=persona1.calcularIMC(peso, estatura);
       


        persona1.pedirDatos();

        System.out.println("El tipo de documento es: " +persona1.getTipoDoc());
        System.out.println("Su numero de documento es: " +persona1.getDocumento());
        System.out.println("Su nombre es: " +persona1.getNombre());
        System.out.println("Su apellido es: " +persona1.getApellido());
        System.out.println("Su sexo es: " +persona1.getSexo());
        System.out.println("Su peso es: " +persona1.getPeso());
        System.out.println("Su estatura es: " +persona1.getEstatura());
        System.out.println("Su IMC es: " + persona1.getPesoActual());
        System.out.println("Su edad es: " +persona1.getEdad());

        //Reto 3

    System.out.println("Digite el tipo del documento del empleado");
    tipoDoc = captura.next();
    System.out.println("Digite el  numero de documento del empleado");
    documento=captura.nextInt();
    System.out.println("Digite el nombre del empleado");
    nombre=captura.next(); 
    System.out.println("Digite el apellido del empleado");
    apellido=captura.next();
    System.out.println();
    System.out.println("Digite el departamento");
    departamento=captura.next();
    System.out.println();
    System.out.println("Digite el cargo del empleado");
    cargo=captura.next();
    System.out.println();
    System.out.println("Digite el valor por hora ");
    valorHora=captura.nextInt();
    System.out.println();
    System.out.println("Digite el total de horas trabajadas por el emleado");
    horasTrabajadas=captura.nextInt();
    System.out.println();
  

    Empleado emp=new Empleado(tipoDoc, documento, nombre, apellido, cargo, valorHora, horasTrabajadas, valorHora, horasTrabajadas, departamento, valorHora, horasTrabajadas, cargo);
     

    emp.calcularHonorarios();

   System.out.println("El Tipo De Documento Es: "+emp.getTipoDoc());
   System.out.println();
   System.out.println("El Numero De Documento Es: "+emp.getDocumento());
   System.out.println();
   System.out.println("El Nombre De La Persona Es: "+emp.getNombre());
   System.out.println();
   System.out.println("El Apellido De "+emp.getNombre()+" Es: "+emp.getApellido());
   System.out.println();
   System.out.println("El departamento De "+emp.getNombre()+" Es: "+departamento);
   System.out.println();
   System.out.println();
   System.out.println("El cargo De "+emp.getNombre()+" Es: "+cargo);
   System.out.println();
   System.out.println("Las horas trabajadas fueron "+horasTrabajadas);
   System.out.println();
   System.out.println("El valor por la hora es de "+valorHora);
   System.out.println();


     captura.close();
        
    }
}

