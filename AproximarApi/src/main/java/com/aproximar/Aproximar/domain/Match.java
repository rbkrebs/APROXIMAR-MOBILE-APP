package com.aproximar.Aproximar.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
public class Match extends AbstractEntity<Long> {

    @NotBlank(message = "Nome da empresa é um campo obrigatório")
    @Size(min = 3, message = "Tamanho mínimo de 3 caracteres para o nome da empresa")
    private String nomeEmpresa;

    @NotBlank(message = "Contato é um campo obrigatório")
    @Size(min = 3, message = "Tamanho mínimo de 3 caracteres para contato")
    private String contato1;

    private String contato2;

    private String contato3;

    @NotBlank(message = "A mensagem é um campo obrigatório")
    @Size(min = 10, message = "Tamanho mínimo de 10 caracteres para mensagem")
    private String mesagem;

    @NotBlank(message = "A identificação de quem contata é um campo obrigatório")
    @Size(min = 10, message = "Tamanho mínimo de 10 caracteres para contatante")
    private String contatante;
}
