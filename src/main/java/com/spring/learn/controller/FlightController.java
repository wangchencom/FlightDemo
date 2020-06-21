package com.spring.learn.controller;

import com.spring.learn.model.Flight;
import com.spring.learn.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightService flightService;

    @RequestMapping("/flightsel")
    public String selFlight(String starCity, String endCity, ModelMap map) {
        List<Flight> flightList = flightService.getTDsByDA(starCity.trim(),endCity.trim());
        map.put("flightlist", flightList);
//        System.out.print(flightList);
        return "test2";
    }
    @RequestMapping("/selallflight")
    @ResponseBody
    public String selAllFlight(){

       return flightService.selAllFlight();

    }
}
