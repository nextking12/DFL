package org.backend.dfl.demo.controllers;


import org.backend.dfl.demo.models.HomeEntity;
import org.backend.dfl.demo.models.dto.HomeDTO;
import org.backend.dfl.demo.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping (value="/home")
public class HomeController {

    @Autowired
    private HomeRepository homeRepository;

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody HomeDTO homeDTO) {
        HomeEntity newCustomer = new HomeEntity(homeDTO.getFirstName(), homeDTO.getLastName(), homeDTO.getEmailAddress(), homeDTO.getPhoneNumber());

        homeRepository.save(newCustomer);

        return new ResponseEntity<>(homeRepository.findAll(), HttpStatus.OK);
    }
}
