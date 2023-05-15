package com.example.JPAdemomay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    LibraryCardService libraryCardService;

    @PostMapping("/add")
    public String addCard(@RequestBody LibraryCard libraryCard){
        return libraryCardService.addCard(libraryCard);
    }
}
