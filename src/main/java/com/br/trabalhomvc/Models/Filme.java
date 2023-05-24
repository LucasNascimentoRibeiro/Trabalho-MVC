package com.br.trabalhomvc.Models;

public class Filme {
    
    private String titulo;
    private String genero;

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }


    

}
