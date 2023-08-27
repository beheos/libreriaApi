package com.beheos.libreriaApi.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beheos.libreriaApi.dao.AutorDao;
import com.beheos.libreriaApi.dao.LibroDao;
import com.beheos.libreriaApi.dto.AutorDto;
import com.beheos.libreriaApi.dto.LibroDto;
import com.beheos.libreriaApi.entidades.Autor;
import com.beheos.libreriaApi.entidades.Libro;

@Service
public class LibreriaServiceImpl implements LibreriaService {

	@Autowired
	AutorDao autorDao;
	@Autowired
	LibroDao LibroDao;
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public AutorDto guardarAutor(AutorDto autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroDto guardarLibro(LibroDto libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutorDto getAutor(Long idAutor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroDto getLibro(Long idLibro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LibroDto> busquedaLibroOAtor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LibroDto> getLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarLibro(Long idLibro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarAutor(Long idAutor) {
		// TODO Auto-generated method stub
		
	}
	
	private Libro mapearToLibro(LibroDto libroDto) {
		return modelMapper.map(libroDto, Libro.class);
	}
	
	private LibroDto mapearToLibroDto(Libro libro) {
		return modelMapper.map(libro, LibroDto.class);
	}
	
	private Autor mapearToAutor(AutorDto autorDto) {
		return modelMapper.map(autorDto, Autor.class);
	}
	
	private AutorDto mapearToAutorDto(Autor autor) {
		return modelMapper.map(autor, AutorDto.class);
	}
	
}
