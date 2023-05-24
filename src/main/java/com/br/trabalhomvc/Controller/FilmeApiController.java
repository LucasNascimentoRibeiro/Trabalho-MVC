package com.br.trabalhomvc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.trabalhomvc.Models.Filme;

@RestController
@RequestMapping("/api/filmes")
public class FilmeApiController {


    private static final List<Filme> filmes = new ArrayList<Filme>();

    public FilmeApiController() {

        filmes.add(new Filme("Lendas do Crime","Ação"));
        filmes.add(new Filme("Titanic","Drama"));
        filmes.add(new Filme("O Chamado","Terror"));
        filmes.add(new Filme("Gente Grande","Comédia"));
        filmes.add(new Filme("Interstellar","Scifi"));

    }

    @GetMapping
    public List<Filme> getFilmes(){
         return filmes;
    }

}
