/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.imc;
//importar el scanner
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPRBaezMIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        System.out.println("Calculadora IMC");
        //Paso1. Declarar Variables
        double w, l, IMC;
        String eIMC;
        //Indicar a Java entrada de teclado
        Scanner Teclado= new Scanner(System.in);
        //Paso2. Asignar valores a las variables
        System.out.println("Introduce Peso");
        w= Teclado.nextDouble();
        System.out.println("Introduce Estatura");
        l= Teclado.nextDouble();
        //Paso3. Resolver problema
        IMC= w/Math.pow (l,2);
        //Paso3.1 Evaluacion IMC
        if (IMC>25){
            eIMC= "Sobrepeso";
        } else if(IMC<19){
            eIMC= "Desnutrición";
        } else {
            eIMC= "Normal";
        }
        //Paso4. Mostrar Resultado
        System.out.println("Peso=" +w);
        System.out.println("Estatura=" +l);
        System.out.println("IMC=" + IMC);
        System.out.println(eIMC);
        
        
    }
    
}
