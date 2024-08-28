package com.bibilioteca.fuctura.dtos;

import com.bibilioteca.fuctura.enums.Tamanho;
import com.bibilioteca.fuctura.models.Categoria;
import com.bibilioteca.fuctura.models.Livro;

public class LivrosDtos {

    private Integer id;
    private String autor;
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
