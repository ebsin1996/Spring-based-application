package cespringwithangular.cespringwithangular;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http//:localhost:4200")
public class MyController {
	
	@Autowired
	MyRepos repo;
	
	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	//First one @Get Mapping gets the mapping
//	@GetMapping("/reg")
//	public String register(@RequestBody Product product)
//	{
//		System.out.println("Called");
//		repo.save(product);
//		return "Registration succesful";
//	}
	
	//We use @PostMapping because we want to post something
	@PostMapping("/reg")
	public String register(@RequestBody Product product)
	{
		System.out.println("Called");
		repo.save(product);
		return "Registration succesful";
	}
	@GetMapping("/showData")
	public List<Product> getProduct()
	{
		
		return repo.findAll();
	}
	
	@DeleteMapping("/del")
	public String deleteUser(@PathVariable int id)
	{
		
		repo.deleteById(id);
		return "Product Deleted";
	}
	
	
	
//	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/printData")
	public List<Product> getproduct()
	{
		System.out.println("Called");
		return Stream.of(new Product(1,"Caar",1000f),
				new Product(2,"Car",1000f),
				new Product(3,"Car",1000f)).collect(Collectors.toList());
			
				
	}

}
