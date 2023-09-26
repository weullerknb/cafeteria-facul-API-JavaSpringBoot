package br.com.cafeteria.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.cafeteria.projeto.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{

}
