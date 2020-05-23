package aula10.previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aula10.previsoes.model.Previsao;


public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}
