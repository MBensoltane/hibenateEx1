import DAO.DaoProduit;
import Model.Produit;

public class MainProduit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Produit prod = new Produit(23, "galaxy s10", "8 RAm");
DaoProduit dao = new DaoProduit();
//dao.create(prod);
//
//Produit prod1 = new Produit(28, "Huawei Y62", "7 RAm");
////DaoProduit dao1 = new DaoProduit();
//dao.create(prod1);

//Produit prod2 = new Produit(32, "Huawei Y62", "7 RAm");
//DaoProduit dao1 = new DaoProduit();
dao.remove(23);
	}

}
