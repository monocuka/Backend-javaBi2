package org.example;

import javax.sql.rowset.serial.SQLOutputImpl;

public class servicioDescargaProxy implements IservicioDescarga{


    @Override
    public void descargar(Usuario user) {
        if (user.getTipo().equals(TipoUser.Premium)) {
            servicioDescarga servicio = new servicioDescarga();
            servicio.descargar(user);
        }
        else {
            System.out.println("No eres servicio Premium");
        }
    }


}
