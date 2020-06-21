package com.spring.learn.controller;

import com.spring.learn.model.City;
import com.spring.learn.service.CityServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    CityServer cityServer;

    @RequestMapping("/getCityByName")
    public String getCityByName(){
        int re =  cityServer.getCityByName("上海");
        System.out.print(re);
        return "test2";
    }
    @RequestMapping("/selallcity")
//    @ResponseBody
    public String selAllFlight(ModelMap map){
        List<City> citylist =  cityServer.selAllCity();
        map.put("city",citylist);
        return "Flightser";
    }
}
