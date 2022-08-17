package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @GetMapping
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
