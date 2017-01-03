package com.example.portatil.practicalistviews;

import android.widget.ImageView;

/**
 * Created by Portatil on 03/01/2017.
 */

public class Titular{

    private String titulo;
    private String subtitulo;
    //private ImageView imagen;

    public Titular(String tit, String sub/*,ImageView img*/){
        titulo = tit;
        subtitulo = sub;
        //imagen = img ;
    }


    public String getTitulo(){
        return  titulo;
    }

    public String getSubtitulo(){
        return subtitulo;
    }

    /*public ImageView getImagen(){        return imagen;    }*/



}