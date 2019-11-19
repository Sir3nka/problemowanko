package com.sirenka.datamanager.service;

import com.sirenka.datamanager.model.Offer;

import java.util.List;

public interface IOfferService {
    boolean saveOffer(Offer of);
    boolean saveOffers(List<Offer> of);
//    Offer getByCompanyName(String name);
    List<Offer> getAllOffers();

}
