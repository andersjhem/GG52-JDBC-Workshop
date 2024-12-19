package org.lexicon.Interface;

import org.lexicon.City;

import java.util.List;

public interface CityDao<LIst> {

    City findById(int id)
    List<City> findByCode(String code)
    List<City> findByName(String name)
    LIst<City> findAll()
    City add(City city)
    City update(City city)
    int delete(City city)



}
