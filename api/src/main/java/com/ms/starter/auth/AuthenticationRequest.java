package com.ms.starter.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {

    @NotEmpty(message = "Email is mandatory.")
    @NotBlank(message = "Email is mandatory.")
    @Email(message = "Invalid E-Mail address.")
    private String email;

    @NotEmpty(message = "Password is mandatory.")
    @NotBlank(message = "Password is mandatory.")
    @Size(min = 6, message = "Password must be atleast 6 characters long.")
    private String password;

}
