/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuenta;

/**
 *
 * @author Nana
 */
public class CCorriente extends CuentaBancaria {
    int TasaInteres, CuotaManejo;
    String SegundaClave, NumCheque,NumTarjetaCredito;
    boolean TarjetaCredito, ChequeraBloqueada;

    public int getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(int TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public int getCuotaManejo() {
        return CuotaManejo;
    }

    public void setCuotaManejo(int CuotaManejo) {
        this.CuotaManejo = CuotaManejo;
    }

    public String getSegundaClave() {
        return SegundaClave;
    }

    public void setSegundaClave(String SegundaClave) {
        this.SegundaClave = SegundaClave;
    }

    public String getNumCheque() {
        return NumCheque;
    }

    public void setNumCheque(String NumCheque) {
        this.NumCheque = NumCheque;
    }

    public String getNumTarjetaCredito() {
        return NumTarjetaCredito;
    }

    public void setNumTarjetaCredito(String NumTarjetaCredito) {
        this.NumTarjetaCredito = NumTarjetaCredito;
    }

    public boolean isTarjetaCredito() {
        return TarjetaCredito;
    }

    public void setTarjetaCredito(boolean TarjetaCredito) {
        this.TarjetaCredito = TarjetaCredito;
    }

    public boolean isChequeraBloqueada() {
        return ChequeraBloqueada;
    }

    public void setChequeraBloqueada(boolean ChequeraBloqueada) {
        this.ChequeraBloqueada = ChequeraBloqueada;
    }
}
