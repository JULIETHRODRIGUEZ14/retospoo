package Salud;

import java.util.Scanner;

public class Persona_3 {
    Scanner sc = new Scanner(System.in);
    String tipoDoc;
    String documento;
    String nombre;
    String apellido;
    public double peso;
    public double estatura;
    int edad;
    String genero;
    public double Imc;

    public Persona_3(){

    }

    public Persona_3(String tipoDoc, String documento, String nombre, String apellido, int edad, float estatura, double peso, String genero) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.genero = genero;

    }

    public void consultarPersona(String nombrePaciente){
        if (nombrePaciente.equalsIgnoreCase(nombre)){
            System.out.println("El paciente" + nombre + " " + apellido + " identificado con " + tipoDoc +
                    " y número " + documento + " de genero " + genero + " con " + edad + " años" + " y con un peso de "
                    + peso + " kg y una estatura de " + estatura + " cms.");
        }
        else {
            System.out.println("Paciente no existe");
        }
    }
}