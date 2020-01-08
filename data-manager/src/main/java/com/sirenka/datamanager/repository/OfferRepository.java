package com.sirenka.datamanager.repository;


import com.sirenka.datamanager.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OfferRepository extends JpaRepository<Offer, UUID> {
   //TODO when refactoring of properties on scrapper side is finished, uncomment it.
   //Offer findByCompany_Name(String companyName);
   //Offer getByCompany_Name(String name);
}
