package com.bibilioteca.fuctura.services;

import com.bibilioteca.fuctura.dtos.LivrosDtos;
import com.bibilioteca.fuctura.exceptions.ObjectNotFoundException;
import com.bibilioteca.fuctura.models.Categoria;
import com.bibilioteca.fuctura.models.Livro;
import com.bibilioteca.fuctura.repositories.CategoriaRepository;
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
        if (livro.isPresent()) {
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

    public Livro save(Integer id_cate, LivrosDtos livrosDtos) {
        livrosDtos.setId(null);
        Categoria cat = CategoriaService.findById(id_cate);
        livrosDtos.setCategoria(cat);
        return livroRepository.save(new Livro(livrosDtos));
    }

    public Livro update(Integer id, LivrosDtos livrosDtos) {
        Livro livro = findById(id);
        livrosDtos.setId(livro.getId());
        return livroRepository.save(new Livro(livrosDtos));
    }

    public void delete(Integer id) {
        findById(id);
        livroRepository.deleteById(id);
    }
}
