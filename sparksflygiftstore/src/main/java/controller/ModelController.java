package controller;
import org.springframework.stereotype.Controller;
import org.springframework.*;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.*;
import org.springframework.web.servlet.*;
import java.util.*;
import model.Product;

import model.ProductDAOImplement;
 
@Controller
public class ModelController {

	List<Product> productlist;
	
	
		@RequestMapping("/modelpage")
		public ModelAndView getMessage(HttpServletRequest request, HttpServletResponse response) {
			
			ModelAndView model= new ModelAndView("home");
			model.addObject("welcome","Hey! you are welcome ");
				return model;
		}
		
		@RequestMapping("/Greetings")
		public ModelAndView getProductDetails(HttpServletRequest request, HttpServletResponse response) {
			
			ProductDAOImplement p=new ProductDAOImplement();
			p.insert();
		
			productlist=p.searchAll();
			
			ModelAndView model= new ModelAndView();
			model.addObject("ProductData",productlist);
				return model;
		}
}
