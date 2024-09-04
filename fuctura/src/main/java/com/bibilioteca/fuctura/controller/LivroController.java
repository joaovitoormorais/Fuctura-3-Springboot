package com.bibilioteca.fuctura.controller;

import com.bibilioteca.fuctura.dtos.LivrosDtos;
import com.bibilioteca.fuctura.models.Livro;
import com.bibilioteca.fuctura.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController//aceita como um argumento um path, mas a anotação deve ser colocada na anotação
//@RequestMapping, enquanto o @RestController deve serusada em argumentos sem parâmetro ou com
//apenas parâmetros opcionais, por isso eu tinha digitado de maneira errada.
@RequestMapping("/{livro}")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping(value = "/{id}" )
    public ResponseEntity <LivrosDtos> findById(@PathVariable Integer id) {
        Livro livro = livroService.findById(id);
    return ResponseEntity.ok().body(new LivrosDtos(livro));
    }

    @GetMapping
   public ResponseEntity<List<LivrosDtos>> findAll(@RequestParam(value = "categoria", defaultValue = "0") Integer id) {
       List<Livro> list = livroService.findAll(id);
       return ResponseEntity.ok().body(list.stream().map(obj -> new LivrosDtos(obj)).collect(Collectors.toList()));
    }

    //localhost:8081/livro?categoria=0

    @GetMapping("/categoria/{nome}")
    public ResponseEntity<List<LivrosDtos>> findAllByCategoriaNome(@PathVariable String nome) {
        List<Livro> list = livroService.findAllByCategoriaNome(nome);
        return ResponseEntity.ok().body(list.stream().map(obj -> new LivrosDtos(obj)).collect(Collectors.toList()));

    }
}
