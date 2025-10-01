package com.example.ch8_ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {
	private final ProductService productService;
	
	//we use dependency injection through the controller's construction parameters to get the service bean from the spring context
	public ProductsController(ProductService productService) {
		this.productService = productService;
	}
	
	//we map the controller action to the /products path, the request mapping annotation by default, uses the HTTP GET method
	//by default request mapping is get request, you can also use GET request with a specific path to the controller's action
	//@RequestMapping("/products")
	@GetMapping("/products")
	//we use a Model parameter to send data from the controller to the view
	public String viewProducts(Model model) {
		//we get the product list from the service
		var products = productService.findAll();
		//we send the product list to the view
		model.addAttribute("products", products);
		//we returned the view name, which will be taken and rendered by the dispatcher servlet
		return "products.html";
	}
	
	//map the controller action to /products path, but use method attribute to change http method to post
	//@RequestMapping(path = "/products", method = RequestMethod.POST)
	//also you can use post mapping for specific path
	@PostMapping("/products")
	//we get the name and the price for the product to add using request parameters
//	public String addProduct(@RequestParam String name, @RequestParam double price, Model model) {
//		//we build a new Product instance and add it to the list by calling the service use case method
//		Product p = new Product();
//		p.setName(name);
//		p.setPrice(price);
//		productService.addProduct(p);
//		//we get the list of products and send it to the view
//		var products = productService.findAll();
//		model.addAttribute("products", products);
//		return "products.html";
//	}
	
	//you can use the model class as a parameter of the controller's action directly
	public String addProduct(Product product, Model model) {
		productService.addProduct(product);
		var products = productService.findAll();
		model.addAttribute("products", products);
		return "products.html";
	}
}
