package com.isi.trombinoscope.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RequestMapping("/contact")
@RestController
@CrossOrigin
public class ContactController {



    @GetMapping("/test")
    public String getTest() {
        System.out.println("Test");
        return new String("Je suis dans le microservice gestion des disponibilites");
    }

}
