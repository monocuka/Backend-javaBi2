package org.example;

public class Usuario {

    private String Nombre;
    private String ID;

    private TipoUser Tipo;

    public Usuario(String nombre, String ID, TipoUser tipo) {
        Nombre = nombre;
        this.ID = ID;
        this.Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public TipoUser getTipo() {
        return Tipo;
    }

    public void setTipo(TipoUser tipo) {
        Tipo = tipo;
    }
}
