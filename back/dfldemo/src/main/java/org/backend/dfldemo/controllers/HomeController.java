package org.backend.dfldemo.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping(value= "/home")
public class HomeController {

    @PostMapping("/add")
    public ResponseEntity<?> add() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
