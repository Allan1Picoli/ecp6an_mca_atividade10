package aula10.previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula10.previsoes.model.Previsao;
import aula10.previsoes.repository.PrevisoesRepository;


@Service
public class PrevisoesService {
	
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	public void salvar(Previsao previsao) {
		previsoesRepo.save(previsao);
	}
	
	public List<Previsao> listarTodos(){
		return previsoesRepo.findAll();
	}
}
