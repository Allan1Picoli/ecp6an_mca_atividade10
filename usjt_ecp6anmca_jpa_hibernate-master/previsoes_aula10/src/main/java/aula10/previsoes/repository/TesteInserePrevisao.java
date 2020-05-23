package aula10.previsoes.repository;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import aula10.previsoes.model.Previsao;
import aula10.previsoes.model.Semana;

public class TesteInserePrevisao {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setDiaDaSemana("Sexta-feira");
		manager.persist(s);
		Previsao p = new Previsao();		
		p.setTemperaturaMin(2.0);
		p.setTemperaturaMax(10.0);
		p.setUmidadeRelAr(75.0);
		p.setLocalDate(LocalDate.now());
		p.setDescricao("Domingo terá temperatura maxima de 16 graus e a minima de 8 graus celcius, com umidade do ar de 25%");
		p.setLatitude(-23.7141);
		p.setLongitude(-46.4137);
		p.setSemana(s);
		manager.persist(p);
		transaction.commit();
		JPAUtil.close();
	}
}
