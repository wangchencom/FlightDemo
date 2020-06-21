package com.spring.learn.dao;

import com.spring.learn.model.Flight;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * FlightDAO继承基类
 */

@Repository
public interface FlightDAO  {
    List<Flight> selectByDAKey(@Param("departureCity")int departureCity, @Param("arrvalCity") int arrvalCity);

    String selAllFlight();
}