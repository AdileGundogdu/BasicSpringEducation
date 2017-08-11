package com.mebitech.springeducation.domain;

import com.mebitech.springeducation.ColorEnum;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private Integer model;

    @Enumerated(EnumType.STRING)
    @Column
    private ColorEnum color;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public ColorEnum getColor() {
        return color;
    }
    public void setColor(ColorEnum color) {
        this.color = color;
  }

}

