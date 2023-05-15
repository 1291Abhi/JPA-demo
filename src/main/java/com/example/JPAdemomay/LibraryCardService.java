package com.example.JPAdemomay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryCardService {
    @Autowired
    LibraryCardRepository libraryCardRepository;
    @Autowired
    StudentRepository studentRepository;

    public  String addCard(LibraryCard libraryCard) {
        return "SUCCESSFULL";

    }
}
