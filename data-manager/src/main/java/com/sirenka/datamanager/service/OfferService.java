package com.sirenka.datamanager.service;

import com.sirenka.datamanager.functional.IterableHandler;
import com.sirenka.datamanager.model.Offer;
import com.sirenka.datamanager.repository.OfferRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public void saveOffer(Offer of) throws OfferException {
        if (offerRepository.save(of) == null ) throw new OfferException("Failed to add offer to data base");
    }

    public void saveOffers(List<Offer> of) throws OfferException {
        if (offerRepository.save(of) == null) throw new OfferException("Failed to add offer to data base");
    }
//
//    public Offer getByCompanyName(String name) {
//        return offerRepository.getByCompany_Name(name);
//    }

    public List<Offer> getAllOffers() {
        return new IterableHandler<Offer>().makeListOffIterable(offerRepository.findAll());
    }
    public Page<Offer> getPageOfOffer(Pageable page) {
        return offerRepository.findAll(page);
    }
}
