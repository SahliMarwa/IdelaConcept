package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.IProduitRepository;
import com.example.entities.Produit;

@RestController
public class ProduitController 
{
	@Autowired
	private IProduitRepository produitInterface;
	@RequestMapping("/add")
	public Produit add (Produit p) {
		
		produitInterface.save(p);
		return p;	
	}
	@RequestMapping("/afficher")
	public List<Produit> afficher() {
		return produitInterface.findAll();
		
	}
	@RequestMapping("/delete")
	public boolean delete(Long ref) {
		produitInterface.delete(ref);
		return true;
		
	}
	@RequestMapping("/update")
	public Produit update(Produit p) {
		 produitInterface.saveAndFlush(p);
		 return p;
		
	}
	
	@RequestMapping("/prodParPage")
	public Page<Produit> prodParPage(int page) {
		return produitInterface.findAll(new PageRequest(page, 3));
		
	}
	@RequestMapping("/recherche")
	public Page<Produit> recherche(int page, String mot) {
		return produitInterface.rechercheMotCle("%"+mot+"%", new PageRequest(page, 3));
		
	}
	
	
	

}
