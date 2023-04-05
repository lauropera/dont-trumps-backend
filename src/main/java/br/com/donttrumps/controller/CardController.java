package br.com.donttrumps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.donttrumps.model.CardModel;
import br.com.donttrumps.repository.CardRepository;

@RestController
@RequestMapping("/cards")
@CrossOrigin(origins = "http://localhost:3000")
public class CardController {

	@Autowired
	private CardRepository repository;

	@GetMapping
	public ResponseEntity<List<CardModel>> findAll() {
		List<CardModel> cards = (List<CardModel>) repository.findAll();
		return ResponseEntity.ok().body(cards);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<CardModel> findById(@PathVariable Integer id) {
		if(id == null) {
			ResponseEntity.badRequest().build();
		}

		CardModel card = repository.findCardById(id);
		
		return ResponseEntity.ok().body(card);
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
		card.setStrength(newCard.getStrength());
		card.setIntelligence(newCard.getIntelligence());
		card.setDefense(newCard.getDefense());
		card.setIsTrunfo(newCard.getIsTrunfo());
		card.setImage(newCard.getImage());
		
		CardModel updatedCard = repository.save(card);

		return ResponseEntity.ok().body(updatedCard);
	}

}
