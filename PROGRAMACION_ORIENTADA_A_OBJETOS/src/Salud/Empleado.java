package Salud;

public class Empleado extends Persona{
    
    //atributos propiros de la subclase 
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;

    //Metodo constructor de la subclase

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String sexo, double peso,
            double estatura, double pesoActual, int edad, String cargo, double valorHora, int horasTrabajadas,
            String departamento) {
        super(tipoDoc, documento, nombre, apellido, sexo, peso, estatura, pesoActual, edad);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    //Metodos propios de la subclase 

public void setDepartamento(String departamento) {
    this.departamento = departamento;
}


    public void calcularHonorarios(){

       double totalPagar;

       totalPagar= valorHora*horasTrabajadas;
       totalPagar=totalPagar-(0.966/100);

       System.out.println("Su tipo de documento es: "+getTipoDoc()+ " su numero de documenro es: "+getDocumento());
       System.out.println();
       System.out.println("Su nombre es: "+getNombre()+ " su apellido es: "+getApellido());
       System.out.println();
       System.out.println("Su cargo es: "+ departamento + " y el dapartamento es: "+cargo);
       System.out.println();
       System.out.println("Trabajo "+horasTrabajadas+ " horas y el valor de la hora es de: "+ valorHora+ " pesos");
       System.out.println();
       System.out.println("Se le debe pagar: "+totalPagar);
    }


}
    
