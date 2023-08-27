package com.beheos.libreriaApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beheos.libreriaApi.entidades.Libro;

public interface LibroDao extends JpaRepository<Libro, Long> {

}
