/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabilidad.operaciones;

/**
 *
 * @author 980035528
 */
public class CapitalSocial {

    public CapitalSocial() {
        this.posicion = null;
    }

    public void setCapitalSocial(String posicion) {
        String[] cs = new String[1000000];
        cs [9] = "Sin nada";
         this.posicion = posicion;
        if (Integer.parseInt(this.posicion) >= 0 && Integer.parseInt(this.posicion) <= cs.length) {
            if (cs[Integer.parseInt(this.posicion)] != null) {
                this.posicion = cs[Integer.parseInt(this.posicion)];
            } else {
                this.posicion = null;
            }

        } else {
            this.posicion = null;
        }
    }

    public String getCapitalSocial() {
        return this.posicion;
    }

    String posicion;

}
