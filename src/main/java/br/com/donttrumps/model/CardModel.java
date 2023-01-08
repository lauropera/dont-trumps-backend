package br.com.donttrumps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cards")
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
	private Integer strength;
	@Column
	private Integer intelligence;
	@Column
	private Integer defense;
	@Column(name = "is_trunfo")
	private boolean isTrunfo;
	@Column(nullable = true)
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "rarity_id", nullable = false)
	private RarityModel rarity;
	
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
	
	public Integer getRarityId() {
		return rarity.getId();
	}
	
	public void setRarity(RarityModel rarity) {
		this.rarity = rarity;
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
