package com.registration.payload;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignupRequest {
	
	@NotBlank
	private String username;
	@NotBlank
	@Email
	private String email;
	 @NotBlank
	private String password;
	private Set<String>roles;

}
