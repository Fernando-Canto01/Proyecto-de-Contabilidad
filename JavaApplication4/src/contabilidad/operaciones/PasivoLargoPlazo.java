/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabilidad.operaciones;

/**
 *
 * @author practicas
 */
public class PasivoLargoPlazo {

    public PasivoLargoPlazo() {
        
        this.posicion = null;
    }

    public void setPasivoLargoPlazo(String posicion) {
        String[] plp = new String[1000000];//PASIVO LARGO PLAZO;
        this.posicion = posicion;
        /*
            FALTA LO SIGUIENTE:
            plp[0] = "Mobiliario: Refrigerador, Anaqueles, Mostrador";
            plp[1] = "Local (Propio)";
            
         */
        if (Integer.parseInt(this.posicion) >= 0 && Integer.parseInt(this.posicion) <= plp.length) {
            if (plp[Integer.parseInt(posicion)] != null) {
                this.posicion = plp[Integer.parseInt(this.posicion)];

            } else {
                this.posicion = null;
            }

        } else {
            this.posicion = null;
        }
    }

    public String getPasivoLargoPlazo() {
        return this.posicion = posicion;
    }

    private String posicion;

}
