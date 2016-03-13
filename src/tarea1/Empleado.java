/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Freiyer
 */
public class Empleado {
    boolean chequeo_op;

    public Empleado(boolean chequeo_op) {
        this.chequeo_op = chequeo_op;
    }
    public Empleado(){
        chequeo_op = false;
    }
    Scanner lector = new Scanner(System.in);
             String nombre,apellido,direccion,rif,cedula;
             Date fecha;
             int antiguedad;
    private List<Programador> prog= new ArrayList<Programador>();
    private List<Tecnico_Electronico> tecnico= new ArrayList<Tecnico_Electronico>();
    private List<Administrativo> admin= new ArrayList<Administrativo>();
    public void IncluirUnEmpleadop(Programador p){
        prog.add(p);
    }
    public void IncluirUnEmpleadot(Tecnico_Electronico tec){
        tecnico.add(tec);
    }
    public void IncluirUnEmpleadoa(Administrativo adm){
        admin.add(adm);
        
    }
    public void AgregarPersonal(){
        int resp;   
        do{
          System.out.println("Nombre: ");
             nombre = lector.next();
             System.out.println("Apellido: ");
             apellido = lector.next();
             System.out.println("Direccion: ");
             direccion = lector.next();
              System.out.println("RIF: ");
             rif = lector.next();
             System.out.println("Cedula: ");
             cedula = lector.next();
             System.out.println("Antiguedad: ");
             antiguedad = lector.nextInt();
              System.out.print("Fecha de nac. del contacto(dd/mm/aaaa): ");
	     fecha = new Date(lector.next());
       chequeo_op=true;
             System.out.println("Introduzca El Tipo de Empleado: ( 1) Administrativo, 2) Programador, 3) Tecnico Electronico.): ");
             int opcion;
             opcion = lector.nextInt();
             switch(opcion){
                 case 1:
                     AgregarAdministrador(); break;
                 case 2:
                     AgregarProgramador();break;
                 case 3:
                     AgregarTecnico(); break;
             }
             System.out.println("Desea agregar otro trabajador?: (1. Si, 2.No))");
             resp = lector.nextInt();
        }while(resp==1);
    } 
    public void AgregarAdministrador(){

             String cargo;
             int rango;
             Administrativo ad = new Administrativo();
         
              System.out.println("Cargo: ");
             cargo = lector.next();
              System.out.println("Rango: ");
              rango = lector.nextInt();
            
             ad.setNombre(nombre);
             ad.setRif(rif);
             ad.setDireccion(direccion);
             ad.setApellido(apellido);
             ad.setAntiguedad(antiguedad);
             ad.setCedula(cedula);
             ad.setCargo(cargo);
             ad.setRango(rango);
             IncluirUnEmpleadoa(ad);
    }
    public void AgregarProgramador(){
             
            
             Programador p = new Programador();
    
             String titulou,lenguaje,proyector;
             int resp;
             int resp2;
             System.out.println("Titulo Universitario:  ");
             titulou= lector.next();
             System.out.println("==========  Lenguajes ========== ");
             do{
             System.out.println("Lenguaje de Programacion: ");
             lenguaje = lector.next();
                   p.IncluirLenguaje(lenguaje);
             System.out.println("Desea agregar otro Lenguaje (1. Si, 2.No): ");
             resp = lector.nextInt();
       
             }while(resp==1);
              System.out.println("==========  Proyectos Realizados ========== ");
               do{
             System.out.println("Proyectos : ");
             proyector = lector.next();
             p.IncluirProyecto(proyector);
             System.out.println("Desea agregar otro Proyecto (1. Si, 2.No): ");
             
             resp2 = lector.nextInt();
             }while(resp2==1);
             p.setNombre(nombre);
             p.setRif(rif);
             p.setDireccion(direccion);
             p.setApellido(apellido);
             p.setAntiguedad(antiguedad);
             p.setCedula(cedula);
             p.setTitulou(titulou);
             IncluirUnEmpleadop(p);
    }
        public void AgregarTecnico(){
             
            
             Tecnico_Electronico te = new Tecnico_Electronico();
    
             String cargo,destrezas,cursosr,trabajost;
             int resp;
             int resp2;
             int resp3;
             System.out.println("Cargo:  ");
             cargo= lector.next();
             System.out.println("==========  Destrezas ========== ");
             do{
             System.out.println("Destrezas: ");
             destrezas = lector.next();
                   te.IncluirDestrezas(destrezas);
             System.out.println("Desea agregar otra Destreza (1. Si, 2.No): ");
             resp = lector.nextInt();
       
             }while(resp==1);
              System.out.println("==========  Cursos Realizados ========== ");
               do{
             System.out.println("Cursos Realizados : ");
             cursosr = lector.next();
                    te.Incluircursosr(cursosr);
             System.out.println("Desea agregar otro Curso (1. Si, 2.No): ");
             
             resp2 = lector.nextInt();
             }while(resp2==1);
               System.out.println("==========  Trabajos Terminados ========== ");
               do{
             System.out.println("Trabajo Terminado : ");
             trabajost = lector.next();
                  te.Incluirtrabajosterminados(trabajost);
             System.out.println("Desea agregar otro Trabajo (1. Si, 2.No): ");
         
             resp3 = lector.nextInt();
             }while(resp3==1);
             te.setNombre(nombre);
             te.setRif(rif);
             te.setDireccion(direccion);
             te.setApellido(apellido);
             te.setAntiguedad(antiguedad);
             te.setCedula(cedula);
             te.setCargo(cargo);
             IncluirUnEmpleadot(te);
    }
    public void ListadoPersonal(){
        if (chequeo_op){
       String msjp="",msja="",msjt="";
        
        System.out.println("======== Listado======= ");
               // System.out.println("Cantidad: " + sizeProgramador() + " 2. " + sizeAdministrativo() + "3. "+ sizeTecnico());
              System.out.println("============ Administradores ===============");
              if (sizeAdministrativo() != 0){
                  
        for (int i=0;i<sizeAdministrativo();i++){
            msja+="\n Nombre:" + getAdministrativo(i).getNombre();
            msja+="\n Apellido: " +getAdministrativo(i).getApellido();
            msja+="\n Cedula: " + getAdministrativo(i).getCedula();
            msja+="\n Fecha de Nacimiento " + getAdministrativo(i).getFecha();
            msja+="\n Direccion: " + getAdministrativo(i).getDireccion();
            msja+="\n Rif: " + getAdministrativo(i).getRif();
            msja+="\n Antiguedad: " + getAdministrativo(i).getAntiguedad();
            msja+="\n Cargo: " + getAdministrativo(i).getCargo();
           msja+="\n Rango: " + getAdministrativo(i).getRango();
           
           
        }
                 System.out.println(msja);
              }
              else
              {
                  System.out.println("Ningun Administrativo");
              }
                    if (sizeProgramador() != 0){
        System.out.println("================ Programadores ================");


        for (int i=0;i<sizeProgramador();i++){
            msjp+="\n Nombre:" + getProgramador(i).getNombre();
            msjp+="\n Apellido: " + getProgramador(i).getApellido();
            msjp+="\n Cedula: " + getProgramador(i).getCedula();
            msjp+="\n Fecha de Nacimiento " + getProgramador(i).getFecha();
            msjp+="\n Direccion: " + getProgramador(i).getDireccion();
            msjp+="\n Rif: " + getProgramador(i).getRif();
            msjp+="\n Antiguedad: " + getProgramador(i).getAntiguedad();
            msjp+="\n Titulo Universitario: " + getProgramador(i).getTitulou();
           /* msjp+= "\n Lenguajes: ";
            for (int j=0;i<getProgramador(i).CantLenguajes();j++)
             msjp+=" \n -" + getProgramador(i).getLenguaje(j);
            msjp+= "\n Proyectos Realizados: ";
            for (int h=0;i<getProgramador(i).CantLenguajes();h++)
             msjp+=" \n -" + getProgramador(i).getProyecto(h);*/
            
            
        
        }
             System.out.println(msjp);
        
      }
        
        else
              {
                  System.out.println("Ningun Programador");
              }
   
  
if (sizeTecnico() != 0){
          System.out.println("=============== Tecnicos Electronicos ============");
          
           for (int i=0;i<sizeTecnico();i++){
            msjt+="\n Nombre:" + getTecnico(i).getNombre();
            msjt+="\n Apellido: " +getTecnico(i).getApellido();
            msjt+="\n Cedula: " + getTecnico(i).getCedula();
            msjt+="\n Fecha de Nacimiento " + getTecnico(i).getFecha();
            msjt+="\n Direccion: " + getTecnico(i).getDireccion();
            msjt+="\n Rif: " + getTecnico(i).getRif();
            msjt+="\n Antiguedad: " + getTecnico(i).getAntiguedad();
            /*  msjp+= "\n Lenguajes: ";
             for (int j=0;i<getProgramador(i).CantLenguajes();j++)
             msjp+=" \n -" + getProgramador(i).getLenguaje(j);
            msjp+= "\n Proyectos Realizados: ";
            for (int h=0;i<getProgramador(i).CantLenguajes();h++)
             msjp+=" \n -" + getProgramador(i).getProyecto(h);*/
           
           
           
           }
              System.out.println(msjt);
        }
        
        else
        {
          System.out.println("Ningun Tecnico");  
        }
        }
        else
        {
            System.err.println("Falta agrega Personal");
        }
    }

    public Administrativo getAdministrativo(int i) {
        return admin.get(i);
    }
    public int sizeAdministrativo() {
        return admin.size();
    }
    public int sizeProgramador() {
        return prog.size();
    }

    public Programador getProgramador(int i) {
        return prog.get(i);
    }

    public int sizeTecnico() {
        return tecnico.size();
    }

    public Tecnico_Electronico getTecnico(int i) {
        return tecnico.get(i);
    }
  
    
}
