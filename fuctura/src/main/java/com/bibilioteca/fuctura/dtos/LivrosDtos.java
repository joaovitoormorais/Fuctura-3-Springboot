package com.bibilioteca.fuctura.dtos;

import com.bibilioteca.fuctura.models.Livro;

public class LivrosDtos {

    private Integer id;
    private String autor;
    private Integer tamanho;
    private String texto;
    private String titulo;

    public LivrosDtos(Integer id, String autor, Integer tamanho, String texto, String titulo) {
        this.id = id;
        this.autor = autor;
        this.tamanho = tamanho;
        this.texto = texto;
        this.titulo = titulo;
    }

    public LivrosDtos(Livro livro) {
    }

    public Integer getId(){
        return  id;
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

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
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
}
