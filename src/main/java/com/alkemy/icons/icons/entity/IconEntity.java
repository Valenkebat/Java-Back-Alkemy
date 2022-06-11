package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Icon")
@Getter
@Setter
public class IconEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String denomination;

    @Column(name = "fecha_creacion")
    @DateTimeFormat( pattern = "yyyy/MM/dd")
    private LocalDate creationDate;

    private Long height;

    private String history;

    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<CountryEntity> countrys = new ArrayList<>();

    public void addCountry(CountryEntity country){ this.countrys.add(country);}
    public void removeCountry(CountryEntity country){ this.countrys.remove(country);}
}
