package com.alkemy.icons.icons.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "continentes")
@Getter
@Setter
public class ContinetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String image;
    private String denomination;
}
