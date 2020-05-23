package aula10.previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aula10.previsoes.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByLoginAndSenha(String login, String senha);

}
