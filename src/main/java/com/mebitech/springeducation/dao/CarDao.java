package com.mebitech.springeducation.dao;

import com.mebitech.springeducation.domain.Car;

import java.util.List;

public interface CarDao {

    public void save(Car car);
    public void delete(Long id);
    public void uptade(Car car);
    public Car findById(Long id);
    public List<Car> findAll();




}
