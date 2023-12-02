package com.freire.vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
    
    private UUID id;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços.")
    private String username;

    @Email(message = "O campo [email] deve conter um e-mail válido.")
    private String email;

    @Length(min = 10, max = 30, message = "A senha deve conter entre (10) e (30) caracteres")
    private String password;

    @Length(min = 1, max = 200, message = "Escreva uma descrição de min (1) letra a (200) letras.")
    private String description;
    
    private String curriculum;

}
