/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabilidad.operaciones;

/**
 *
 * @author fernando
 */
public class ActivoCirculante {

    // ac = new String[100]; //ACTIVO CIRCULANTE
    public ActivoCirculante() {

        this.posicion = null;

    }

    public void setActivoCirculante(String posicion) {
        String ac[] = new String[1000000];
        ac[1] = "Activo";
        ac[11] = "Activo circulante";
        ac[111] = "Caja chica";
        ac[112] = "Inventario";
        ac[1121] = "Coca-Cola 2.5 Retornable";
        ac[1122] = "Fritos Chipotle 56g";
        ac[1123] = "Cheeto Queso 56";
        ac[113] = "Clientes";
        ac[1131] = "Linus Torvalds";
        ac[1132] = "Richard Stallman";
        ac[114] = "Deudores";
        ac[1141] = " Melissa Castillo";
        ac[1142] = "Alejando Sagundo";

        this.posicion = posicion;
        if (Integer.parseInt(this.posicion) >= 0 && Integer.parseInt(this.posicion) <= ac.length) {
            if (ac[Integer.parseInt(this.posicion)] != null) {
                this.posicion = ac[Integer.parseInt(this.posicion)];

            } else {
                this.posicion = null;
            }

        } else {
            this.posicion = null;
        }
    }

    public String getActivoCirculante() {
        return posicion;
    }

    private String posicion;

}
