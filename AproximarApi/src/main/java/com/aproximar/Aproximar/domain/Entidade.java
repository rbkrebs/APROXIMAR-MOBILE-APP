package com.aproximar.Aproximar.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;


@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entidade extends AbstractEntity<Long>{

    @NotBlank(message = "Nome é um campo obrigatório.")
    @Size(min = 3, message = "Limite mínimo de caracteres é 3.")
    private String nome;

    @Email(message = "O valor não condiz com um e-mail válido.")
    private String email;

    @NotBlank(message = "Nome é um campo obrigatório.")
    @Size(min = 5, message = "Limite mínimo de caracteres é 5.")
    private String senha;

}
