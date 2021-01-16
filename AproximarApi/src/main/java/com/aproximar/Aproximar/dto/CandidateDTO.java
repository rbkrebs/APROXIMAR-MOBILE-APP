package com.aproximar.Aproximar.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.time.format.DateTimeFormatter;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDTO {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @NotBlank(message = "Nome é um campo obrigatório")
    private String nome;

    @NotBlank(message = "E-mail é um campo obrigatório")
    @Email(message = "O valor não condiz com um e-mail válido")
    private String email;

    @NotBlank(message = "Senha é um campo obrigatório")
    @Size(min = 10, message = "A senha deve ter no mínimo 10 caracteres")
    private String senha;

    @NotBlank(message = "O campo Sobre é obrigatório")
    private String sobre;



}
