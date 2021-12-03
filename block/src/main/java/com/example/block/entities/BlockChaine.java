package com.example.block.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlockChaine {
    @Id
    private String id;
    private String nom;
    private int difficulte;
    private Double miningReward;
    @OneToOne
    private Block block;
}
