package br.com.donttrumps.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.donttrumps.model.CardModel;

public interface CardRepository extends CrudRepository<CardModel, Integer> {

	List<CardModel> findAll();
	CardModel findCardById(Integer id);
	
}
