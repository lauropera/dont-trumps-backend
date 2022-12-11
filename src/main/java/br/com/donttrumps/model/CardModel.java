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

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "rarity")
	private String rarity;

	@Column(name = "strength")
	private Integer strength;

	@Column(name = "intelligence")
	private Integer intelligence;

	@Column(name = "defense")
	private Integer defense;

	@Column(name = "is_trunfo")
	private boolean isTrunfo;

	@Column(name = "image")
	private String image;
	
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

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
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
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

}
