package es.gurugu.apirest.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.gurugu.apirest.entitys.Product;

@RestController
@RequestMapping("products")
public class ProductsREST {
	
	//Con getmapping contestara al metodo get del request mapping "principal" es decir "products"
	@GetMapping
	public ResponseEntity<List<Product>> getProduct(){

		return ResponseEntity.ok();
	}
	
	//@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello world";
	}

}
