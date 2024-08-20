package com.bibilioteca.fuctura.services;

import com.bibilioteca.fuctura.dtos.CategoriaDtos;
import com.bibilioteca.fuctura.models.Categoria;
import com.bibilioteca.fuctura.repositories.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Categoria findById(Integer id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }

    @GetMapping
    public List<Categoria> findAll() {

        return categoriaRepository.findAll();
    }

    public Categoria save(CategoriaDtos categoriaDtos) {
     Categoria categoria = modelMapper.map(categoriaDtos, Categoria.class);
    categoria.setId(null);
    return categoriaRepository.save(categoria);
    }

    @PutMapping("/{id}")
       public ResponseEntity<Categoria> update(@PathVariable Integer id, @RequestBody Categoria categoria) {
        categoria.setId(id);
       Categoria updateCategoria = categoriaRepository.save(categoria);
       return ResponseEntity.ok(updateCategoria);
    }

    public  Categoria update(Integer id, CategoriaDtos categoriaDtos) {
     Categoria categoria = findById(id);
     categoria.setNome(categoriaDtos.getNome());
     return  categoriaRepository.save(categoria);
    }

    public void delete(Integer id) {
         Categoria categoria = findById(id);
        categoriaRepository.delete(categoria);
    }
}
