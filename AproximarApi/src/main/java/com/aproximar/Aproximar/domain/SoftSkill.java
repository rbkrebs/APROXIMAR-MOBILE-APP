package com.aproximar.Aproximar.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
public class SoftSkill extends AbstractEntity<Long> {


    @NotBlank(message = "Nome é um campo obrigatório")
    @Size(min = 3)
    private String nome;



}
