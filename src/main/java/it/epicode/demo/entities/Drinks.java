package it.epicode.demo.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Drinks {
    private String name;
    private int calories;
    private double price;
}
