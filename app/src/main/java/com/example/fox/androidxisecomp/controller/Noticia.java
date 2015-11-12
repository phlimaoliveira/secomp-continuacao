package com.example.fox.androidxisecomp.controller;

/**
 * Created by Fox on 12/11/2015.
 */
public class Noticia {

    public Integer imagem;
    public String tituloNoticia;
    public String autorNoticia;
    public Integer imagemAutor;
    public String descricaoNoticia;

    public Noticia() { }

    public Noticia(Integer imagem, String tituloNoticia, String autorNoticia, Integer imagemAutor, String descricaoNoticia) {
        this.imagem = imagem;
        this.tituloNoticia = tituloNoticia;
        this.autorNoticia = autorNoticia;
        this.imagemAutor = imagemAutor;
        this.descricaoNoticia = descricaoNoticia;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }

    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public String getAutorNoticia() {
        return autorNoticia;
    }

    public void setAutorNoticia(String autorNoticia) {
        this.autorNoticia = autorNoticia;
    }

    public Integer getImagemAutor() {
        return imagemAutor;
    }

    public void setImagemAutor(Integer imagemAutor) {
        this.imagemAutor = imagemAutor;
    }

    public String getDescricaoNoticia() {
        return descricaoNoticia;
    }

    public void setDescricaoNoticia(String descricaoNoticia) {
        this.descricaoNoticia = descricaoNoticia;
    }

}
