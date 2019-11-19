package com.sirenka.datamanager.controller;


import com.sirenka.datamanager.model.Offer;
import com.sirenka.datamanager.service.IOfferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/get.offers")
public class FetchOffersController {
    private final IOfferService offerService;

    @PostMapping
    @ResponseBody
    public List<Offer> fetchOffers() {
        return offerService.getAllOffers();
    }
}
