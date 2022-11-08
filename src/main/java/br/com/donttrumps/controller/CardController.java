package br.com.donttrumps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
