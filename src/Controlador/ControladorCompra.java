/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JOptionPane;
import modelo.SolicitudCompra;
/**
 *
 * @author Estudiante
 */
public class ControladorCompra {
    
    SolicitudCompra   vectorCompra[]= new SolicitudCompra[100];
     int c=0;
       int pos=-1;
     public  void registrarCategoria(SolicitudCompra objCat){
        
        vectorCompra[c]=objCat;
    c++;
   /*   for (int i = 0; i < c; i++) {
            System.out.println("Valor: " + vectorCategoria[i].toString());
        }
   */
    } 
    public void listarCom(){
    
        for (int i = 0; i <c; i++) {
            System.out.println("Valor: "+vectorCompra[i].toString());  
        }
    
    }
    public int posicion(String valor ){
  
        for (int i = 0; i < c; i++) {
            if(valor.compareTo(vectorCompra[i].getIdCompra())==0){
            pos=i;
            }
        }
    return pos ; 
    }
    public void eliminarCompra(String valor){
    ControladorCompra obj2 = new ControladorCompra();
    int p=obj2.posicion(valor);
    if (pos != -1){
        for (int i = pos; i < c; i++) {
            vectorCompra[i]=vectorCompra[i+1];
            c--;
            JOptionPane.showMessageDialog(null, "Compra  eliminada ");
        }
    
    }else{
    
    JOptionPane.showMessageDialog(null,"no se encuentra");
    }
    
    }
    
    public SolicitudCompra buscarCompra(String id)
    {
    SolicitudCompra objCom=null;
        for (int i = 0; i < c; i++) 
        {
            if(id.compareTo(vectorCompra[i].getIdCompra())==0)
            {
            objCom=vectorCompra[i];
            
            
            }
        }
    return objCom;
    
    
    }
    
}
