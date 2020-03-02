package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DaoProduit;
import DAO.IDaoProduit;
import Model.Produit;

/**
 * Servlet implementation class servletController
 */
@WebServlet("/add")
public class servletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produit p= new Produit();
		p.setNomProduit(request.getParameter("name"));
		p.setDescription(request.getParameter("description"));
		p.setNomProduit(request.getParameter("name"));
		IDaoProduit dao = new DaoProduit();
		int i = dao.create(p);
		if (i==1) {
			request.setAttribute("msg", "This product was created ");
			
		}
		else {
			request.setAttribute("msg", "This product was not created ");
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/produits.jsp").forward(request, response);
	}

}
