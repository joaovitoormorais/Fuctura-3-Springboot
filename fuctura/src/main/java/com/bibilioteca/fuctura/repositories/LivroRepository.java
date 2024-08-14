package com.bibilioteca.fuctura.repositories;
import com.bibilioteca.fuctura.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
