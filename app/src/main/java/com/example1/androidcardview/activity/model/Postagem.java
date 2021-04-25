package com.example1.androidcardview.activity.model;

public class Postagem {

    private String nome;
    private String postagem;
    private String horario;
    private int imagem;

    public Postagem() {
    }

    public Postagem(String nome, String postagem, String horario, int imagem) {
        this.nome = nome;
        this.postagem = postagem;
        this.horario = horario;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
