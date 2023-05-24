package com.br.trabalhomvc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.trabalhomvc.Models.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private static final List<Filme> filmes = new ArrayList<Filme>();

    public FilmeController() {
        filmes.add(new Filme("Lendas do Crime","Ação"));
        filmes.add(new Filme("Titanic","Drama"));
        filmes.add(new Filme("O Chamado","Terror"));
        filmes.add(new Filme("Gente Grande","Comédia"));
        filmes.add(new Filme("Interstellar","Scifi"));
    }

    @GetMapping
    public String getFilmes(Model model)
    {
        model.addAttribute("filmes", filmes);
        return "filmes";

    }
}
