package com.bibilioteca.fuctura.dtos;

import com.bibilioteca.fuctura.enums.Tamanho;
import com.bibilioteca.fuctura.models.Categoria;
import com.bibilioteca.fuctura.models.Livro;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class LivrosDtos {

    private Integer id;
    private String autor;
   @NotEmpty(message = "O campo autor não pode ficar vazio!")
   @Length(min = 3, max = 20, message = "O campo autor deve conter de 3 a 20 caracteres")
   @NotEmpty(message = "O campo texto não pode ficar vazio!")
   @Length(min = 1000, max = 10000, message = "O campo texto deve conter de 1000 a 10000 carcteres")
   @NotEmpty(message = "O campo título não pode ficar vazio!")
   @Size(min = 3, max = 50, message = "O campo títuo deve conter de 3 a 50 caracteres")
    private Tamanho tamanho;
    private String texto;
    private String titulo;
    private Categoria categoria;

    public LivrosDtos() {
    }

    public LivrosDtos(Integer id, String autor, Tamanho tamanho, String texto, String titulo, Categoria categoria) {
        this.id = id;
        this.autor = autor;
        this.tamanho = tamanho;
        this.texto = texto;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public LivrosDtos(Livro livro) {
        this.id = livro.getId();
        this.autor = livro.getAutor();
        this.tamanho = livro.getTamanho();
        this.texto = livro.getTexto();
        this.titulo = livro.getTitulo();
        this.categoria = livro.getCategoria();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
