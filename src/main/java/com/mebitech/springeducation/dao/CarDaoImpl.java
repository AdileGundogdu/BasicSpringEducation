package com.mebitech.springeducation.dao;

import com.mebitech.springeducation.domain.Car;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.concurrent.Callable;

@Transactional
@Component
public class CarDaoImpl implements CarDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Car car) {
        entityManager.persist(car);
    }

    @Override
    public void delete(Long id) {
        Car car = findById(id);
        entityManager.remove(car);
    }


    @Override
    public void uptade(Car car) {
        entityManager.merge(car);

    }


    @Override
    public Car findById(Long id) {
        String sql="SELECT c FROM Car c WHERE c.id = :id";
        Car car= (Car) entityManager
                .createQuery(sql)
                .setParameter("id",id)
                .getSingleResult();
        return car;
    }

    @Override
    public List<Car> findAll() {

        String sql="SELECT c FROM Car c";

        List<Car> list = entityManager
                .createQuery(sql)
                .getResultList();
        if(list.size()>0){
            return list;
        }
        return null;
    }
}
