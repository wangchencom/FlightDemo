package com.spring.learn.service;

import com.spring.learn.dao.CityDAO;
import com.spring.learn.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServer {
    @Autowired
    CityDAO cityDAO;
    public int getCityByName(String cityName) {
        return cityDAO.getCityByName(cityName);
    }

    public List<City> selAllCity() {
        return cityDAO.selAllCity();
    }
}
