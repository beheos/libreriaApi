package com.beheos.libreriaApi.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.NumberFormat;

import lombok.Data;

@Data
public class LibroDto {

	private Long id;
	@NotEmpty
	private AutorDto autor;
	@NotEmpty
	private String titulo;
	@NotEmpty
	private String resenia;
	@NumberFormat
	private BigDecimal precio;
	
}
