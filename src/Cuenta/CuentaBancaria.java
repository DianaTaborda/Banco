/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuenta;
import Cliente.DatosPersonales;
/**
 *
 * @author Nana
 */
public class CuentaBancaria {
    
    long NumeroCuenta;
    boolean Estado, bloquedo, cerrar;
    String clave;

    public long getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(long NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public boolean isBloquedo() {
        return bloquedo;
    }

    public void setBloquedo(boolean bloquedo) {
        this.bloquedo = bloquedo;
    }

    public boolean isCerrar() {
        return cerrar;
    }

    public void setCerrar(boolean cerrar) {
        this.cerrar = cerrar;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void CambiarClave(){
        
    }
     public void CambiarEstado (){
    }
    
    public void Bloquear (){
    }
    
    public void CerrarCuenta (){
    }
}
