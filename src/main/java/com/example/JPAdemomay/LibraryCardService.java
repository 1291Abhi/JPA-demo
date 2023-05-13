package com.example.JPAdemomay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryCardService {
    @Autowired
    LibraryCardRepository libraryCardRepository;

    public  String addCard(LibraryCard libraryCard){
        libraryCardRepository.save(libraryCard);
        return "LibraryCard Successfully added";
    }
}
