package Sena;

import java.util.Scanner;

public class Aprendiz {

    Scanner leer = new Scanner (System.in);
    //Definir atributos
    public String nombreAprendiz = "July";
    public String direccionAprendiz;
    public int edadAprendiz;
    public String telefonoAprendiz;
    public String fichaAprendiz;

    //Métodos/operaciones
    /*public void registrarPersona() {
        System.out.println("Ingrese la edad ");
        edadAprendiz=leer.nextInt();
        //Limpiar buffer
        leer.nextLine();
        System.out.println("Ingrese la sede ");
        direccionAprendiz = leer.next();       
    }/*
    
    /*Definir un nombre por defecto crear un método que:
        - muestre el nombre actual
        - solicite y actualice nuevo nombre
        - muestre el valor modificado    
    */

    //Método sin valor de retorno  
    public void cambiarNombre (){
        System.out.println("El nombre actual es " + nombreAprendiz);

        System.out.println("Ingrese el nuevo nombre");
        nombreAprendiz = leer.next();

        System.out.println("El nuevo nombre es " + nombreAprendiz);
    }    

    //Método sin valor de retorno con parametros 
    public void cambiarNombre (String newName){

        nombreAprendiz = newName;
        System.out.println("El nuevo nombre es " + nombreAprendiz);
    }

    //Método con valor de retorno con parametros
    public int calcularEdad (int anioNacimiento){

        edadAprendiz = 2022 - anioNacimiento;
        return edadAprendiz;
    }
}