/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class SolicitudCompra {

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    private String norden;
    private String fecha;
    private String fecharecep;
    private String proovedor;
    private String importe;
    private String pOrdenado;
    private String direccion;
    private String idCompra;
    
    public SolicitudCompra() {
    }

    public SolicitudCompra(String norden, String fecha, String fecharecep, String proovedor, String importe, String pOrdenado, String direccion) {
        this.norden = norden;
        this.fecha = fecha;
        this.fecharecep = fecharecep;
        this.proovedor = proovedor;
        this.importe = importe;
        this.pOrdenado = pOrdenado;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "SolicitudCompra{" + "norden=" + norden + ", fecha=" + fecha + ", fecharecep=" + fecharecep + ", proovedor=" + proovedor + ", importe=" + importe + ", pOrdenado=" + pOrdenado + ", direccion=" + direccion + '}';
    }

    
    
    
    
    public String getNorden() {
        return norden;
    }

    public void setNorden(String norden) {
        this.norden = norden;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecharecep() {
        return fecharecep;
    }

    public void setFecharecep(String fecharecep) {
        this.fecharecep = fecharecep;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getpOrdenado() {
        return pOrdenado;
    }

    public void setpOrdenado(String pOrdenado) {
        this.pOrdenado = pOrdenado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    
    
    
    
    
}
