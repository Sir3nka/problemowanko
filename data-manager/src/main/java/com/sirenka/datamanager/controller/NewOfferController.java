package com.sirenka.datamanager.controller;

import com.sirenka.datamanager.functional.HandleExecution;
import com.sirenka.datamanager.model.Offer;
import com.sirenka.datamanager.model.ResponseClass;
import com.sirenka.datamanager.service.IOfferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class NewOfferController {
    private final IOfferService offerService;

    @RequestMapping("/new.offer")
    @PostMapping
    public ResponseClass saveSubmittedOffer(@RequestBody Offer off) {
        try {
            new HandleExecution<IOfferService>().executeThrowableFunction(handler -> handler.saveOffer(off), offerService);
        } catch (Exception ex) {
            return ResponseClass.builder().content(ex.getMessage()).build();
        }
        return ResponseClass.builder().content("Succesfully added offers to data base!").build();
    }

    @RequestMapping("/new.offers")
    @PostMapping
    public ResponseClass saveSubmittedOffers(@RequestBody List<Offer> off) {
        try {
            new HandleExecution<IOfferService>().executeThrowableFunction(handler -> handler.saveOffers(off), offerService);
        } catch (Exception ex) {
            return ResponseClass.builder().content(ex.getMessage()).build();
        }
        return ResponseClass.builder().content("Succesfully added offers to data base!").build();
    }

}