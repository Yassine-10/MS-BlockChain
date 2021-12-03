package com.example.block.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Block {
    @Id
    private String id;
    private Date dateCreation;
    private String hashCode;
    private String hashPrecedent;
    @OneToMany
    private List<Transaction> transactions=new ArrayList<>();
    private int nonce;

}
