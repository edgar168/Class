/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author Erick
 */
public class Class {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       // TODO code application logic here
       
Personas humanos = new Personas("Alumno","Edgar Cach",18,'H',"CATE020919HCCCMDA9");
        System.out.println(humanos.toString());
        Edificios escuela=new Edificios("I","Salones",true,90);
      System.out.println(escuela.toString());
    }
    
}
