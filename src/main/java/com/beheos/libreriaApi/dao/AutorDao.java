package com.beheos.libreriaApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beheos.libreriaApi.entidades.Autor;

public interface AutorDao extends JpaRepository<Autor, Long> {

}
