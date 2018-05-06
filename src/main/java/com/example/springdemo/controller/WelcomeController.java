package com.example.springdemo.controller;

import com.example.springdemo.domain.CountryEntity;
import com.example.springdemo.repository.CountryRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WelcomeController {

    @Autowired
    private CountryRepository countryRepository;

    private static final Log LOGGER = LogFactory.getLog(WelcomeController.class);

    @GetMapping("/welcome")
    public String getWelcomePage(Model model) {
//        LOGGER.info("Going to default URL");
//
//        model.addAttribute("listCountries", countryRepository.findAll());
//        LOGGER.info(countryRepository.findAll().size());
//
        return "welcome";
    }

    @GetMapping("/getList")
    public ResponseEntity<List<CountryEntity>> getList(){
        LOGGER.info(countryRepository.findAllByOrderByIdAsc().size());
        return new ResponseEntity<>(countryRepository.findAllByOrderByIdAsc(), HttpStatus.OK);
    }

}
