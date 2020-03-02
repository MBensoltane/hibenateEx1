package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Produit;

public class DaoProduit implements IDaoProduit{
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
@Override
public int create(Produit p) {
	// TODO Auto-generated method stub
	try {
	session.beginTransaction();
	session.saveOrUpdate(p);
	session.getTransaction().commit();

	return 1;
	}
	catch (HibernateException e) {
		e.printStackTrace();
		return 0;	
}
}
@Override
public int remove(int idProduit) {
	// TODO Auto-generated method stub
	//Session session = getSessionFactory().getCurrentSession();
	Produit prod3 = new Produit();
	prod3.setIdProduit(idProduit);
	try {
		session.beginTransaction();
		session.delete(prod3);
		session.getTransaction().commit();
		session.close();
		return 1;
		
	}
	catch (HibernateException e) {
		e.printStackTrace();
		return 0;	
}
	
	
//Session session = getSessionFactory().getCurrentSession();
//Transaction trans = session.beginTransaction();
//session.delete(typeEmploi);
//trans.commit();
}


}
