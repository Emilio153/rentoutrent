package com.daw.alquiler.services.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
public class LoginRequest {
	
    private String email; // En tu app usamos email en lugar de username
    private String password;
}