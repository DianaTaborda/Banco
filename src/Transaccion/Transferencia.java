/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transaccion;
import Cliente.DatosPersonales;
/**
 *
 * @author Nana
 */
public class Transferencia {
    String DestinoDeposito, OrigenDeposito;
    boolean aprobada;
    int Cantidad;

    public String getDestinoDeposito() {
        return DestinoDeposito;
    }

    public void setDestinoDeposito(String DestinoDeposito) {
        this.DestinoDeposito = DestinoDeposito;
    }

    public String getOrigenDeposito() {
        return OrigenDeposito;
    }

    public void setOrigenDeposito(String OrigenDeposito) {
        this.OrigenDeposito = OrigenDeposito;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}
