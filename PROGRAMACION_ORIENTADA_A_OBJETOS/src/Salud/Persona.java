package Salud;

import java.util.Scanner;

public class Persona {

    //Atributos con visibilidad privada

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private String sexo;
    private double peso;
    private double estatura;
    private double pesoActual;
    private int edad;

    //Metodo constructor vacio

   /*  public void Persona(){
    }*/ 

//Metodo Constructor
   
public Persona(String tipoDoc, int documento, String nombre, String apellido, String sexo, double peso,
double estatura, double pesoActual, int edad) {
this.tipoDoc = tipoDoc;
this.documento = documento;
this.nombre = nombre;
this.apellido = apellido;
this.sexo = sexo;
this.peso = peso;
this.estatura = estatura;
this.pesoActual = pesoActual;
this.edad = edad;
}


  //Encapsulamiento GET=Mostrar , SET=Enviar informacion 
  // Metodos getters y settters 

    public Persona() {
}



    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }



    public int getDocumento() {
        return documento;
    }



    public void setDocumento(int documento) {
        this.documento = documento;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public double getPeso() {
        return peso;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }



    public double getEstatura() {
        return estatura;
    }



    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }



    public double getPesoActual() {
        return pesoActual;
    }



    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }

      //Metodos son las operaciones 

    public void pedirDatos(){
        Scanner captura=new Scanner(System.in);

        System.out.println("Por favor ingrese su tipo de documento");
        tipoDoc=captura.nextLine();

        System.out.println("Por favor ingrese su documento");
        documento=captura.nextInt();

        System.out.println("Por favor ingrese su nombre");
        nombre=captura.next();

        System.out.println("Por favor ingrese su apellido");
        apellido=captura.next();

        System.out.println("Por favor ingrese su edad");
        edad=captura.nextInt();

        System.out.println("Por favor ingrese su peso");
        peso=captura.nextDouble();

        System.out.println("Por favor ingrese su estatura");
        estatura=captura.nextDouble();

        System.out.println("Por favor ingrese su sexo");
        sexo=captura.next();
        captura.close();
    }

    public void mostrarPersona(){

        System.out.println();
        System.out.println("La persona registrada es  "+nombre+ " "+apellido+ " su tipo de sexo es: " +sexo );
        System.out.println();
        System.out.println("Su tipo de documento es: " +tipoDoc+ " con numero " +documento);
        System.out.println();
        System.out.println("Su peso es: " +peso+ " con una estatura " +estatura);
        System.out.println();
    }

    public void calcularImc(){
 
        pesoActual=peso/(estatura*estatura);

        System.out.println("Su IMC es de "+ pesoActual);
        System.out.println();

        if( pesoActual< 20){
            System.out.println("Su peso esta por debajo de lo ideal");
        }
        else if( pesoActual>=20 && pesoActual<=25){
            System.out.println("Su peso es ideal");
        }
        else if( pesoActual>25){
            System.out.println("Tiene sobrepeso");
        }
    }

//Metodo con retorno 

    public double calcularIMC(double peso,double estatura){

        double pesoActual1=peso/(estatura*estatura);
        if( pesoActual< 20){
            System.out.println("PESO BAJO");
        }
        else if( pesoActual>=20 && pesoActual<=25){
            System.out.println("PESO IDEAL");
        }
        else if( pesoActual>25){
            System.out.println("SOBREPESO");
        }
        return pesoActual1;
    }

    public void mayorEdad(){

        System.out.println("Su edad es " +edad);
        System.out.println();

        if( edad>=18){
            System.out.println("Usted es mayor de edad");
        }
        else if ( edad<18){
            System.out.println("Usted es menor de edad");

        }
    }

}
