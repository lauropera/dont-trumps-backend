package br.com.donttrumps.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.donttrumps.model.CardModel;
import br.com.donttrumps.repository.CardRepository;

@RestController
@RequestMapping("/cards")
public class CardController {

	@Autowired
	private CardRepository repository;

	@GetMapping
	public ResponseEntity<List<CardModel>> findAll() {
		List<CardModel> cards = (List<CardModel>) repository.findAll();
		return ResponseEntity.ok().body(cards);
	}

	@PostMapping
	public ResponseEntity<CardModel> createCard(@RequestBody CardModel card) {
		CardModel newCard = repository.save(card);
		return ResponseEntity.created(null).body(newCard);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<CardModel>
		updateCard(@PathVariable Integer id, @RequestBody CardModel newCard) {
		if(id == null) {
			ResponseEntity.badRequest().build();
		}
		
		CardModel card = repository.findCardById(id);
		card.setName(newCard.getName());
		card.setDescription(newCard.getDescription());
		card.setRarity(newCard.getRarity());
		card.setAttr1(newCard.getAttr1());
		card.setAttr2(newCard.getAttr2());
		card.setAttr3(newCard.getAttr3());
		card.setIsTrunfo(newCard.getIsTrunfo());
		
		CardModel updatedCard = repository.save(card);
		return ResponseEntity.ok().body(updatedCard);
	}

}
