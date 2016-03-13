/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;
import java.util.Scanner;
/**
 *
 * @author Freiyer
 */
public class Tarea1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Empleado e = new Empleado();
        int opcion;
        do{
        System.out.println("========Consultoria24=========== ");
        System.out.println("1): Agregar Personal ");
        System.out.println("2): Listado de Personal: ");
        
        opcion=lector.nextInt();
        switch(opcion){
                case 1:
                    e.AgregarPersonal();break;
                case 2:
                    e.ListadoPersonal();break;
        }
        }while(opcion != 3);
        // TODO code application logic here
    }
    
}
