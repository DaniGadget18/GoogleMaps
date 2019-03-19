package com.example.googlemaps;

public class Mapa {

    private Integer Longitud;
    private Integer Altitud;


    public Mapa(Integer longitud, Integer altitud) {
        Longitud = longitud;
        Altitud = altitud;
    }

    public Integer getLongitud() {
        return Longitud;
    }

    public void setLongitud(Integer longitud) {
        Longitud = longitud;
    }

    public Integer getAltitud() {
        return Altitud;
    }

    public void setAltitud(Integer altitud) {
        Altitud = altitud;
    }


}
