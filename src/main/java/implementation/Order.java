package implementation;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Value("#{goodPizza}") IPizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Zamówienie: " + pizza.getName() + " cena: " + pizza.getPrice());
    }


    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
