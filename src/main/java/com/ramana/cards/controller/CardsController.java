package com.ramana.cards.controller;

import com.ramana.cards.model.Cards;
import com.ramana.cards.model.Customer;
import com.ramana.cards.repositories.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {
    @Autowired
    private CardsRepository repository;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer){
        List<Cards> cards = repository.findByCustomerId(customer.getCustomerId());
        return cards;
    }
}
