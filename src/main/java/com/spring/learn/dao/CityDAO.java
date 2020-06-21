package com.spring.learn.dao;

import com.spring.learn.model.City;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CityDAO继承基类
 */
@Repository
public interface CityDAO {
    int getCityByName(String cityName);

    List<City> selAllCity();
}