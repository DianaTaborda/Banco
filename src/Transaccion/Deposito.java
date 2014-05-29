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
public class Deposito {
    String CuentaDestino;
    int Cantidad;

    public String getCuentaDestino() {
        return CuentaDestino;
    }

    public void setCuentaDestino(String CuentaDestino) {
        this.CuentaDestino = CuentaDestino;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}
