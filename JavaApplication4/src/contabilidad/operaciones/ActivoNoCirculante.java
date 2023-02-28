/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabilidad.operaciones;

/**
 *
 * @author fernando
 */
public class ActivoNoCirculante {

    public ActivoNoCirculante() {
        this.posicion = null;
    }

    public void setActivoNoCirculante(String posicion) {
        String[] anc = new String[1000000];
        anc[12] = "Activo no circulate";
        anc[121] = "Moviliario";
        anc [1211] = "Refrigerador";
        anc [1212] = "Anaqueles";
        anc [1213] = "Mostrador";
        anc [122] = "Local";
        this.posicion = posicion;
        if (Integer.parseInt(this.posicion) >= 0 && Integer.parseInt(this.posicion) <= anc.length) {
            if (anc[Integer.parseInt(this.posicion)] != null) {
                this.posicion = anc[Integer.parseInt(this.posicion)];

            } else {
                this.posicion = null;
            }

        } else {
            this.posicion = null;
        }

    }

    public String getActivoNoCirculante() {
        return this.posicion;
    }

    private String posicion;
}
