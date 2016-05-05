package model;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImplement implements ProductDAOInterface {

	 public List <Product> productlist=new ArrayList();
	public void insert() {
			for(int i=0; i<20;i++){
			
			int pid=i+1;
			String pname="Product#"+i;
			String pdesc="ProductDesc#"+i;
			float  price=(float)i;
			String category="Category#"+i;
			String status="Status#"+i;
			
			productlist.add(new Product(pid,pname,pdesc,price,category,status));
		}
		
	}

	public void update(Object o) {
		// TODO Auto-generated method stub
		
	}

	public List searchAll() {
		if(!productlist.isEmpty()){ 
			
			return productlist; 
			
		}
		else{
		return null;
		
		}
	}

	public void search(Object o) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Object o) {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void search() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
