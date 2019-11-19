package com.sirenka.datamanager.controller;

import com.sirenka.datamanager.functional.EvaluateOutcome;
import com.sirenka.datamanager.functional.IBooleanExecute;
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
        IBooleanExecute<Offer> referencedMethod = offerService::saveOffer;
        return new EvaluateOutcome<Offer>().evaluateActionOutcome(referencedMethod, off);
    }

    @RequestMapping("/new.offers")
    @PostMapping
    public ResponseClass saveSubmittedOffer(@RequestBody List<Offer> off) {
        IBooleanExecute<List<Offer>> referencedMethod = offerService::saveOffers;
        return new EvaluateOutcome<List<Offer>>().evaluateActionOutcome(referencedMethod, off);
    }

}