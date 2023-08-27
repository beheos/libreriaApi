package com.beheos.libreriaApi.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class AutorDto {

	private Long id;
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellido;
}
