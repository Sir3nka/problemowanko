package com.sirenka.datamanager.service;

import com.sirenka.datamanager.model.Offer;

import java.util.List;

public interface IOfferService {
    void saveOffer(Offer of) throws OfferException;
    void saveOffers(List<Offer> of) throws OfferException;
//    Offer getByCompanyName(String name);
    List<Offer> getAllOffers();

}
