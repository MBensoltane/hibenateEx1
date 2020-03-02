package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="produits")
public class Produit {
@Id	

private int idProduit;
@Column (name="n_produit")
private String nomProduit;
@Transient // poiur dire que je veux pas avoir une colonne sur la tabless
private String description;

//Getteurs et setteurs
public int getIdProduit() {
	return idProduit;
}
public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Produit(int idProduit, String nomProduit, String description) {
	super();
	this.idProduit = idProduit;
	this.nomProduit = nomProduit;
	this.description = description;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", description=" + description + "]";
}


}
