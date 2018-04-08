/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author luigitercero
 */
public class Calculadora {
    Operacion op;
    public Calculadora(){
        this.op = new Operacion();
    }
    
    
    public void ini(){
        menu();
        getOption();
    }
    
    private void menu() {
        System.out.println("Menu ");
        System.out.println("1.) sumar");
        System.out.println("2.) Restar");
        System.out.println("3.) Multiplicar");
        System.out.println("4.) Dividir");
        System.out.println("5.) Salida");
    }

    private int getOption() {
        System.out.println("elija opcion");
        String entradaTeclado = getConsola();
        System.out.println("escriba valor1");
        String op1 = getConsola();
        System.out.println("escriba valor2");
        String op2 = getConsola();
        try {
            int valor = op(entradaTeclado,op1,op2);
            System.out.println("resultado:");
            System.out.println(valor);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;
         
    }
    
    
    private int op(String operador, String val1, String val2){
           int a = Integer.parseInt(val1);
           int b = Integer.parseInt(val2);
        switch(operador){
            case "1":
               return this.op.suma(a, b);
            case "2":
                return this.op.resta(a, b);
            case "3":
                return this.op.multiplicar(a, b);
            case "4":
                return this.op.dividir(a, b);
        }
       
        throw new Error("no se eligio correctamente");
    }
    
    private String getConsola(){
        String salida = "";
         Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
        salida = entradaEscaner.nextLine();
        return salida;
    }
    
    
}
