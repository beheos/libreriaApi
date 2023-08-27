package com.beheos.libreriaApi.service;

import java.util.List;

import com.beheos.libreriaApi.dto.AutorDto;
import com.beheos.libreriaApi.dto.LibroDto;

public interface LibreriaService {

	AutorDto guardarAutor(AutorDto autor);
	
	LibroDto guardarLibro(LibroDto libro);
	
	AutorDto getAutor(Long idAutor);
	
	LibroDto getLibro(Long idLibro);
	
	List<LibroDto>busquedaLibroOAtor();
	
	List<LibroDto>getLibros();
	
	void eliminarLibro(Long idLibro);
	
	void eliminarAutor(Long idAutor);
	
}
