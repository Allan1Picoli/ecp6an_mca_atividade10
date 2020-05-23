package aula10.previsoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula10.previsoes.model.Usuario;
import aula10.previsoes.repository.UsuarioRepository;


@Service
public class LoginService {

	@Autowired
	UsuarioRepository usuarioRepo;
	
	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}
