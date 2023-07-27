package org.example;

public class servicioDescarga implements IservicioDescarga {

    @Override
    public void descargar(Usuario user) {
        System.out.println("Descarga exitosa");
    }
}
