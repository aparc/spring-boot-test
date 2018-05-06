package com.example.springdemo.domain;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "country_name", unique = true, nullable = false)
    private String countryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "CountryEntity{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
