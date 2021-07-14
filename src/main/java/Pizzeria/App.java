package Pizzeria;

import api.IOrder;
import config.AutoConfig;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(Order.class);
        order.printOrder();

    }

}
