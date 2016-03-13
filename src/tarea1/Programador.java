/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;
import java.util.*;
/**
 *
 * @author Freiyer
 */
public class Programador extends Trabajador{
     private List<String> lenguajes= new ArrayList<String>();
       private List<String> proyectosr= new ArrayList<String>();
     String titulou;

    public String getTitulou() {
        return titulou;
    }

    public void setTitulou(String titulou) {
        this.titulou = titulou;
    }
     
     public void IncluirLenguaje(String l){
         lenguajes.add(l);
     }
     public int CantLenguajes(){
         return lenguajes.size();
     }
     public String getLenguaje(int i){
        return  lenguajes.get(i);
     }
      public void IncluirProyecto(String l){
         proyectosr.add(l);
     }
     public int Cantproyectosr(){
         return proyectosr.size();
     }
     public String getProyecto(int i){
        return  proyectosr.get(i);
     }
    
}
