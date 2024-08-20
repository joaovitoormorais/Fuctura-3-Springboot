package com.bibilioteca.fuctura.services;

import com.bibilioteca.fuctura.dtos.CategoriaDtos;
import com.bibilioteca.fuctura.exceptions.ObjectNotFoundException;
import com.bibilioteca.fuctura.models.Categoria;
import com.bibilioteca.fuctura.repositories.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaService {

    @Autowired
    private static CategoriaRepository categoriaRepository;

    @Autowired
    private ModelMapper modelMapper;

    public static Categoria findById(Integer id) {
        Optional<Categoria> cat = categoriaRepository.findById(id);
       if(cat.isPresent()) {
           return cat.get();
       }
        throw new ObjectNotFoundException("Categoria não encontrada!");
    }

    @GetMapping
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria save(CategoriaDtos categoriaDtos) {
     Categoria categoria = modelMapper.map(categoriaDtos, Categoria.class);
    categoria.setId(null);
    return categoriaRepository.save(modelMapper.map(categoriaDtos, Categoria.class));
    }

    public Categoria update(CategoriaDtos categoriaDtos) {
        findById(categoriaDtos.getId());
        findByNome(categoriaDtos);
        return categoriaRepository.save(modelMapper.map(categoriaDtos, Categoria.class));
    }

    public void delete(Integer id) {
        findById(id);
        Optional<Categoria> cat = categoriaRepository.findById(id);
        if (!cat.get().getLivros().isEmpty()) {
            throw new DataIntegrityViolationException("Categoria possui livros, não pode ser deletada!!!");
        }
        categoriaRepository.deleteById(id);

    }

    private void findByNome(CategoriaDtos categoriaDto) {
        Optional<Categoria> cat = categoriaRepository.findByNome(categoriaDto.getNome());
        if (cat.isPresent() && cat.get().getNome().equalsIgnoreCase(categoriaDto.getNome())) {
            throw new IllegalArgumentException("Já existe uma categoria com este nome " + categoriaDto.getNome());

        }

            }

            public void buscarPorNome(String nome) {
                Optional<Categoria> cat = categoriaRepository.findByNomeContainingIgnoreCase(nome);
                if (cat.isEmpty()) {
                    throw new ObjectNotFoundException("Categoria não encontrada");
                }

            }

    }


