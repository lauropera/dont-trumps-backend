package br.com.donttrumps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cards")
public class CardModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private String description;

	@Column
	private String rarity;

	@Column(name = "strength")
	private Integer strength;

	@Column(name = "inteligence")
	private Integer inteligence;

	@Column(name = "defense")
	private Integer defense;

	@Column(name = "is_trunfo")
	private boolean isTrunfo;

	@Column(name = "image_url")
	private String imageUrl;
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getInteligence() {
		return inteligence;
	}

	public void setInteligence(Integer inteligence) {
		this.inteligence = inteligence;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public boolean getIsTrunfo() {
		return isTrunfo;
	}

	public void setIsTrunfo(boolean isTrunfo) {
		this.isTrunfo = isTrunfo;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
