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

	@Column(name = "attr_1")
	private Integer attr1;

	@Column(name = "attr_2")
	private Integer attr2;

	@Column(name = "attr_3")
	private Integer attr3;

	@Column(name = "is_trunfo")
	private boolean isTrunfo;

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getAttr1() {
		return attr1;
	}

	public void setAttr1(Integer attr1) {
		this.attr1 = attr1;
	}

	public Integer getAttr2() {
		return attr2;
	}

	public void setAttr2(Integer attr2) {
		this.attr2 = attr2;
	}

	public Integer getAttr3() {
		return attr3;
	}

	public void setAttr3(Integer attr3) {
		this.attr3 = attr3;
	}

	public boolean isTrunfo() {
		return isTrunfo;
	}

	public void setTrunfo(boolean isTrunfo) {
		this.isTrunfo = isTrunfo;
	}

}
