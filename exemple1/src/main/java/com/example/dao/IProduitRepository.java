package com.example.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {
	@Query("select p from Produit p where p.design like :x ")
	public Page<Produit> rechercheMotCle(@Param("x") String mc, Pageable p);

}