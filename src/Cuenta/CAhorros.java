/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuenta;

/**
 *
 * @author zanty
 */
public class CAhorros extends CuentaBancaria {
    boolean TarjetaDebito, CuentaNomina;
    String SegundaClave, NumTarjeta;
    int CuotadeManejo, TasaInteres;

    public boolean isTarjetaDebito() {
        return TarjetaDebito;
    }

    public void setTarjetaDebito(boolean TarjetaDebito) {
        this.TarjetaDebito = TarjetaDebito;
    }

    public boolean isCuentaNomina() {
        return CuentaNomina;
    }

    public void setCuentaNomina(boolean CuentaNomina) {
        this.CuentaNomina = CuentaNomina;
    }

    public String getSegundaClave() {
        return SegundaClave;
    }

    public void setSegundaClave(String SegundaClave) {
        this.SegundaClave = SegundaClave;
    }

    public String getNumTarjeta() {
        return NumTarjeta;
    }

    public void setNumTarjeta(String NumTarjeta) {
        this.NumTarjeta = NumTarjeta;
    }

    public int getCuotadeManejo() {
        return CuotadeManejo;
    }

    public void setCuotadeManejo(int CuotadeManejo) {
        this.CuotadeManejo = CuotadeManejo;
    }

    public int getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(int TasaInteres) {
        this.TasaInteres = TasaInteres;
    }
}
