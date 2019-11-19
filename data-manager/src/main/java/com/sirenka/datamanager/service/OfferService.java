package com.sirenka.datamanager.service;

import com.sirenka.datamanager.functional.IterableHandler;
import com.sirenka.datamanager.model.Offer;
import com.sirenka.datamanager.repository.OfferRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

@AllArgsConstructor
@Service
public class OfferService implements IOfferService {
    private final OfferRepository offerRepository;

    public boolean saveOffer(Offer of) {
        return offerRepository.save(of) != null;
    }

    public boolean saveOffers(List<Offer> of) {
        return offerRepository.save(of) != null;
    }
//
//    public Offer getByCompanyName(String name) {
//        return offerRepository.getByCompany_Name(name);
//    }

    public List<Offer> getAllOffers() {
        return new IterableHandler<Offer>().makeListOffIterable(offerRepository.findAll());
    }
}
