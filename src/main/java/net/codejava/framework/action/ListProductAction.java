/**
 * Copyright CodeJava.net To Present
 * All rights reserved.
 */
package net.codejava.framework.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.framework.dao.ProductDAO;
import net.codejava.framework.model.Product;
 
import com.opensymphony.xwork2.ActionSupport;
 
@Action("listProduct")
@ResultPath("/WEB-INF/views")
@Result(name = "success", location = "ProductList.jsp")
public class ListProductAction extends ActionSupport {
	
	@Autowired
	private ProductDAO productDAO;
	
	private List<Product> listProduct;

	public String execute() {
		listProduct = productDAO.list();
		return SUCCESS;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}
}