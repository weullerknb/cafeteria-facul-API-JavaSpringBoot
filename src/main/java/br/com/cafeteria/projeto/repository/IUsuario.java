package br.com.cafeteria.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cafeteria.projeto.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer>{

}
