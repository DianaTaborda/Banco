/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Banco;

/**
 *
 * @author Nana
 */
public class Sucursal {
    String Direccion, Nombre ,Empleados, Telefono;
    int Nit;

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(String Empleados) {
        this.Empleados = Empleados;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }
}
