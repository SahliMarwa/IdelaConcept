package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long reference;
	private String design;
	private Double prix;
	public Long getReference() {
		return reference;
	}
	public void setReference(Long reference) {
		this.reference = reference;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Produit(Long reference, String design, Double prix) {
		super();
		this.reference = reference;
		this.design = design;
		this.prix = prix;
	}
	 public Produit(){}

}
