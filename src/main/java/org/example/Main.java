package org.example;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("pepito", "hola", TipoUser.Free);
        Usuario usuario2 = new Usuario("juanita", "holi", TipoUser.Premium);

        IservicioDescarga servicio1 = new servicioDescargaProxy();
        servicio1.descargar(usuario);
        IservicioDescarga servicio2 = new servicioDescargaProxy();
        servicio2.descargar(usuario2);

    }
}