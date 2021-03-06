package com.model;
// Generated 20 janv. 2018 04:43:44 by Hibernate Tools 5.2.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Commandedetails generated by hbm2java
 */
@Entity
@Table(name = "commandedetails", catalog = "onlineshop")
public class Commandedetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCommandeD;
	@Column(name="idCommande")
	private Long idcommande;
	@Column(name="idProduit")
	private Long idproduit;
	private String quantite;
	private String name;
	private Double price;

	public Commandedetails() {
	}

	public Commandedetails(Long idcommande, Long idproduit, String quantite, String name, Double price) {
		this.idcommande = idcommande;
		this.idproduit = idproduit;
		this.quantite = quantite;
		this.name = name;
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCommandeD", unique = true, nullable = false)
	public Long getIdCommandeD() {
		return this.idCommandeD;
	}

	public void setIdCommandeD(Long idCommandeD) {
		this.idCommandeD = idCommandeD;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "idCommande", nullable = false)
	public Long getIdCommande() {
		return this.idcommande;
	}

	public void setIdCommande(Long idcommande) {
		this.idcommande = idcommande;
	}

//	@ManyToOne(fetch = FetchType.LAZY)
//@JoinColumn(name = "idProduit", nullable = false)
	public Long getIdProduit() {
		return this.idproduit;
	}

	public void setIdProduit(Long idproduit) {
		this.idproduit = idproduit;
	}

	@Column(name = "quantite", nullable = false, length = 45)
	public String getQuantite() {
		return this.quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", nullable = false, precision = 10, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
