package com.aproximar.Aproximar.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Data
@Table(name = "candidate",
        uniqueConstraints =
        @UniqueConstraint(columnNames = "email", name = "email_uk"))
public class Candidate extends Entidade {

    @NotBlank(message = "Nome é um campo obrigatório")
    @Size(min = 3)
    private String sobre;

    private String pontuacao;

    @OneToMany
    private Set<SoftSkill> softSkills;

    @OneToMany
    private Set<Match> matches;




}
