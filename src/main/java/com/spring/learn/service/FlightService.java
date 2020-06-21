package com.spring.learn.service;

import com.spring.learn.dao.CityDAO;
import com.spring.learn.dao.FlightDAO;
import com.spring.learn.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightDAO flightDAO;
    @Autowired
    CityDAO cityDAO;

    public List<Flight> getTDsByDA(String departureCity, String arrvalCity) {
        List<Flight> flightList = flightDAO.selectByDAKey(cityDAO.getCityByName(departureCity), cityDAO.getCityByName(arrvalCity));
        return flightList;
    }

    public String selAllFlight() {
        String flights = flightDAO.selAllFlight();
        return flights;
    }
}
