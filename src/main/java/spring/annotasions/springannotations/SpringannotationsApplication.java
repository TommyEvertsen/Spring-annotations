package spring.annotasions.springannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.annotasions.springannotations.Controller.PizzaController;

@SpringBootApplication
public class SpringannotationsApplication {

	public static void main(String[] args) {
	var context = SpringApplication.run(SpringannotationsApplication.class, args);

		PizzaController pizzaController = (PizzaController) context.getBean("pizza");
		System.out.println(pizzaController.getPizza());
		System.out.println(pizzaController.getVegPizza());
	}

}
