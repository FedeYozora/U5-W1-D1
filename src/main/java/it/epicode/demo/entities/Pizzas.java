package it.epicode.demo.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Pizzas {
    private String name;
    private String baseIngredients;
    private List<Toppings> toppings;
    private int calories;
    private double price;
}
