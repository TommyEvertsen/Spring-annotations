package spring.annotasions.springannotations.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.annotasions.springannotations.Service.VegPizza;

@Component("pizza")
//Component annotation makes the class a spring bean
public class PizzaController {

public String getPizza(){
    return "Hot pizza";
}

private VegPizza vegPizza;

@Autowired
//Autowired automatically inject the VegPizza bean
public PizzaController(VegPizza vegPizza){
    this.vegPizza = vegPizza;
}

public String getVegPizza(){
    return vegPizza.getVeggyPizza();
}




}
