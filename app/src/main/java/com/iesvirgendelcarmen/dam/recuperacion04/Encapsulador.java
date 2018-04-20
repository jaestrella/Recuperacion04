package com.iesvirgendelcarmen.dam.recuperacion04;

/**
 * Created by matinal on 20/04/2018.
 */

public class Encapsulador {
    int idImagen;
    String textoTitulo,textoContenido;

    public Encapsulador(int idImagen, String textoTitulo, String textoContenido) {
        this.idImagen = idImagen;
        this.textoTitulo = textoTitulo;
        this.textoContenido = textoContenido;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getTextoTitulo() {
        return textoTitulo;
    }

    public String getTextoContenido() {
        return textoContenido;
    }


}
