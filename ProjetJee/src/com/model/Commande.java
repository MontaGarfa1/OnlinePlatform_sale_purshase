package com.model;
// Generated 20 janv. 2018 04:43:44 by Hibernate Tools 5.2.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Commande generated by hbm2java
 */
@Entity
@Table(name = "commande", catalog = "onlineshop")
public class Commande implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCommande;
	@Column(name="iduser")
	private Long idclient;
	private String datecommande;
	private Double price;
	//private Set<Commandedetails> commandedetailses = new HashSet<Commandedetails>(0);

	public Commande() {
	}

	public Commande(Long idclient, String datecommande, Double price) {
		this.idclient = idclient;
		this.datecommande = datecommande;
		this.price = price;
	}

	/*public Commande(Long idclient, String name, String datecommande, Double price,
			Set<Commandedetails> commandedetailses) {
		this.idclient = idclient;
		this.name = name;
		this.datecommande = datecommande;
		this.price = price;
		this.commandedetailses = commandedetailses;
	}
*/
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCommande", unique = true, nullable = false)
	public Long getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "idClient", nullable = false)
	public Long getIdClient() {
		return this.idclient;
	}

	public void setIdClient(Long idclient) {
		this.idclient = idclient;
	}

	@Column(name = "datecommande", nullable = false, length = 45)
	public String getDatecommande() {
		return this.datecommande;
	}

	public void setDatecommande(String datecommande) {
		this.datecommande = datecommande;
	}

	@Column(name = "price", nullable = false, precision = 10, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "commande")
	public Set<Commandedetails> getCommandedetailses() {
		return this.commandedetailses;
	}

	public void setCommandedetailses(Set<Commandedetails> commandedetailses) {
		this.commandedetailses = commandedetailses;
	}
*/
}
