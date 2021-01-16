package com.aproximar.Aproximar.service;


import java.util.List;

public interface EntidadeService<T> {

    T salvar(T t);
    List<T> buscarTodos();
    T buscarPorEmail(String email);


}


