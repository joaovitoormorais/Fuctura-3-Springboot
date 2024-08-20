package com.bibilioteca.fuctura.services;

import com.bibilioteca.fuctura.exceptions.ObjectNotFoundException;
import com.bibilioteca.fuctura.models.Livro;
import com.bibilioteca.fuctura.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class LivroService {

@Autowired
    public LivroRepository livroRepository;

public Livro findById(Integer id) {
    Optional<Livro> livro = livroRepository.findById(id);
    if(livro.isPresent()) {
        return livro.get();
    }

    throw new ObjectNotFoundException("Livro não encontrado");
}

    public List<Livro> findAll(Integer id_cat) {
    CategoriaService.findById(id_cat);
        return livroRepository.findAllLivrosByCategoria(id_cat);
    }

    public List<Livro> findAllByCategoriaNome(String nome) {
        return livroRepository.findByCategoriaNomeContainingIgnoreCase(nome);
    }
}
