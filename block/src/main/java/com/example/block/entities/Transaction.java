package com.example.block.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transaction {
    @Id
    private String id;
    private Date date;
    private String adresseSource;
    private String adresseDestination;
    private Double montant;
}
