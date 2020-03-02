package DAO;

import Model.Produit;

public interface IDaoProduit {
public int create (Produit p);
public int remove (int idProduit);
}
