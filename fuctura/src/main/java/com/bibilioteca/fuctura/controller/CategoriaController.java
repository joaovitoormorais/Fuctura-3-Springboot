package com.bibilioteca.fuctura.controller;

import com.bibilioteca.fuctura.dtos.CategoriaDtos;
import com.bibilioteca.fuctura.models.Categoria;
import com.bibilioteca.fuctura.services.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private ModelMapper modelMapper;

    //@GetMapping("{id}") = buscar id
    //@GetMapping = buscar todos
    //@GetMapping{obj} = salvar
    //@PostMapping{obj = salvar
    //@PutMapping{obj} = atualizar
    //@DeleteMapping("/{id}") = deletar

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDtos> findById(@PathVariable Integer id) {
        Categoria cat = categoriaService.findById(id);
        CategoriaDtos categoriaDtos = modelMapper.map(cat, CategoriaDtos.class);
        return ResponseEntity.ok().body(categoriaDtos);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaDtos>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        List<CategoriaDtos> listDto = list.stream().map(obj -> modelMapper.map(obj, CategoriaDtos.class)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping
        public ResponseEntity<CategoriaDtos> save(@PathVariable Integer id, @RequestBody CategoriaDtos categoriaDtos) {
            Categoria cat = categoriaService.save(categoriaDtos);
            return ResponseEntity.ok().body(modelMapper.map(cat, CategoriaDtos.class));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaDtos> update(@PathVariable Integer id, @RequestBody CategoriaDtos categoriaDtos) {
        categoriaDtos.setId(id);
        Categoria cat = categoriaService.update(categoriaDtos);
        return ResponseEntity.ok().body(modelMapper.map(cat, CategoriaDtos.class));
    }

    @DeleteMapping("/{id}")
        public ResponseEntity<Void> delete(@PathVariable Integer id) {
        categoriaService.delete(id);
        return ResponseEntity.ok().build();
    }
}

//localhost:8080/categorid/id
