package com.aproximar.Aproximar.service;


import com.aproximar.Aproximar.domain.SoftSkill;

import java.util.List;

public interface EntidadeService<T> {

    T salvar(T t);
    List<T> buscarTodos();
    T buscarPorEmail(String email);
    List<T> buscarCandidatePorSkill(String softSkill);



}


