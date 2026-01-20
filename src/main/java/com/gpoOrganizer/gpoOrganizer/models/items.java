package com.gpoOrganizer.gpoOrganizer.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "items")
public class items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private ItemCategory category;

    @Column(unique = true)
    private String name;

    private ItemRarity rarity;

    private String imageUrl;
}
