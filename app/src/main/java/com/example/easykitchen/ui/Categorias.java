package com.example.easykitchen.ui;

public class Categorias {
    private  Integer id;
    private String Categoria;

    public Categorias(Integer id, String categoria) {
        this.id = id;
        Categoria = categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getCategoria() {
        return Categoria;
    }
    @Override
    public String toString()
    {
        return "Categorias{}";
    }
}
