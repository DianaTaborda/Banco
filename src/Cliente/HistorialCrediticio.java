/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

/**
 *
 * @author Nana
 */
public class HistorialCrediticio {
    String CantidadAdeudada;
    boolean Estado, Bloqueado, PazySalvo;

    public String getCantidadAdeudada() {
        return CantidadAdeudada;
    }

    public void setCantidadAdeudada(String CantidadAdeudada) {
        this.CantidadAdeudada = CantidadAdeudada;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public boolean isBloqueado() {
        return Bloqueado;
    }

    public void setBloqueado(boolean Bloqueado) {
        this.Bloqueado = Bloqueado;
    }

    public boolean isPazySalvo() {
        return PazySalvo;
    }

    public void setPazySalvo(boolean PazySalvo) {
        this.PazySalvo = PazySalvo;
    }
    
    public void GenerarPazySalvo(){
        
    }
    public void Bloquear(){
        
    }
    public void Desactivar(){
        
    }
}
