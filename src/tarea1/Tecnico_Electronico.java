/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Freiyer
 */
public class Tecnico_Electronico extends Trabajador{
    String Cargo;
private List<String> destrezas= new ArrayList<String>();
       private List<String> cursosr= new ArrayList<String>();
       private List<String> trabajosterminados = new ArrayList<String>();
  public void IncluirDestrezas(String desc){
      destrezas.add(desc);
  }
  public String getDestrezas(int pos){
      return destrezas.get(pos);
  }
 public int cantDestrezas(){
     return destrezas.size();
 }
 public void Incluircursosr(String cursos){
      cursosr.add(cursos);
  }
  public String getcursosr(int pos){
      return cursosr.get(pos);
  }
 public int cantcursosr(){
     return cursosr.size();
 }
   public void Incluirtrabajosterminados(String tr){
      trabajosterminados.add(tr);
  }
  public String gettrabajosterminados(int pos){
      return trabajosterminados.get(pos);
  }
 public int cantrabajosterminados(){
     return trabajosterminados.size();
 }
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
