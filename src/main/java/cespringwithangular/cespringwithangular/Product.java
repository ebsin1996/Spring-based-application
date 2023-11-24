package cespringwithangular.cespringwithangular;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	float cost;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, float cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getcost() {
		return cost;
	}
	
	
	
}