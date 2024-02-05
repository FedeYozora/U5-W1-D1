package it.epicode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PizzeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzeriaApplication.class, args);
        configurationClass();
    }

    public static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzeriaApplication.class);
        System.out.println(ctx.getBean("pizzaMargherita"));
        System.out.println(ctx.getBean("PizzaHawaiian"));
        System.out.println(ctx.getBean("PizzaSalami"));
        System.out.println(ctx.getBean("allPizzas"));
        System.out.println(ctx.getBean("allDrinks"));
        System.out.println(ctx.getBean("allToppings"));
        System.out.println(ctx.getBean("menuCompleto"));
        ctx.close();
    }
}
