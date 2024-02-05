package it.epicode.demo;

import it.epicode.demo.entities.Drinks;
import it.epicode.demo.entities.Menu;
import it.epicode.demo.entities.Pizzas;
import it.epicode.demo.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {
    String baseIngredients = "Formaggio e Pomodoro";

    @Bean
    Pizzas pizzaMargherita(List<Toppings> allToppings) {
        List<Toppings> toppings = Arrays.asList();
        return new Pizzas("Margherita", baseIngredients, toppings, 1104, 4.99);
    }

    @Bean
    Pizzas PizzaHawaiian(List<Toppings> allToppings) {
        List<Toppings> HawaiianToppings = Arrays.asList(Ham(), Pineaaple());
        return new Pizzas("Hawaiian", baseIngredients, HawaiianToppings, 1024, 6.49);
    }

    @Bean
    Pizzas PizzaSalami(List<Toppings> allToppings) {
        List<Toppings> SalamiToppings = Arrays.asList(Salami());
        return new Pizzas("Salami", baseIngredients, SalamiToppings, 1160, 5.99);
    }

    @Bean
    public List<Pizzas> allPizzas(List<Toppings> allTopings) {
        return Arrays.asList(pizzaMargherita(allTopings), PizzaSalami(allTopings), PizzaHawaiian(allTopings));
    }

    @Bean
    public Drinks lemonade() {
        return new Drinks("Limonata", 128, 1.29);
    }

    @Bean
    public Drinks water() {
        return new Drinks("Acqua", 0, 1.29);
    }

    @Bean
    public Drinks wine() {
        return new Drinks("Vino", 607, 7.49);
    }

    @Bean
    public List<Drinks> allDrinks() {
        return Arrays.asList(lemonade(), water(), wine());
    }

    @Bean
    Toppings Ham() {
        return new Toppings("Prosciutto", 35, 0.99);
    }

    @Bean
    public Toppings Cheese() {
        return new Toppings("Formaggio", 92, 0.69);
    }

    @Bean
    public Toppings Tomato() {
        return new Toppings("Pomodoro", 50, 0.99);
    }

    @Bean
    public Toppings Onions() {
        return new Toppings("Cipolla", 22, 0.69);
    }

    @Bean
    public Toppings Pineaaple() {
        return new Toppings("Ananas", 24, 0.79);
    }

    @Bean
    public Toppings Salami() {
        return new Toppings("Salame", 86, 0.99);
    }

    @Bean
    public List<Toppings> allToppings() {
        return Arrays.asList(Cheese(), Tomato(), Ham(), Onions(), Pineaaple(), Salami());
    }

    @Bean
    public Menu menuCompleto(List<Pizzas> pizzas, List<Drinks> drinks, List<Toppings> toppings) {
        return new Menu(pizzas, toppings, drinks);
    }
}
