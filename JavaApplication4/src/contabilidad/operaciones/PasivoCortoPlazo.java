/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabilidad.operaciones;

/**
 *
 * @author practicas
 */
public class PasivoCortoPlazo {

    public PasivoCortoPlazo() {
        this.posicion = null;
        
    }

    public void setPasivoCortoPlazo(String posicion) {
        String[] pcp = new String[1000000];
        pcp[21] = "Pasivos (Corto Plazo)";
        pcp[211] = "Proveedores";
        pcp[2111] = "Bimbo";
        pcp[2112] = "Sabritas";
        pcp[2113] = "Barcel";
        pcp[212] = "Anticipo de clientes";
        
        this.posicion = posicion;
        if (Integer.parseInt(this.posicion) >= 0 && Integer.parseInt(this.posicion) <= pcp.length) {
            if (pcp[Integer.parseInt(this.posicion)] != null) {
                this.posicion = pcp[Integer.parseInt(this.posicion)];
            } else {
                this.posicion = null;
            }

        } else {
            this.posicion = null;
        }
    }

    public String getPasivoCortoPlazo() {
        return this.posicion;
    }

    private String posicion;

}
