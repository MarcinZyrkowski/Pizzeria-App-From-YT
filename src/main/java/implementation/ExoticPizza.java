package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    public ExoticPizza(@Value("1") int price, @Value("egzotyczna pizza") String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
