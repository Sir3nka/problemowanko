package com.sirenka.datamanager.controller;


import com.sirenka.datamanager.model.Offer;
import com.sirenka.datamanager.service.IOfferService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class FetchPageOfOffersController {
    private final IOfferService offerService;
    private int pageSize = 15;

    @RequestMapping("getOffers/page/{page}")
    @PostMapping
    public Page<Offer> getPageOfOffers(@PathVariable("page") int page, @RequestBody int pageSize) {
        PageRequest pageable = new PageRequest(page - 1, pageSize);
        return offerService.getPageOfOffer(pageable);
    }

    @RequestMapping("getOffers/setPageSize")
    @PostMapping
    public void setPageSize(@RequestBody int pageSize) {
        this.pageSize = pageSize;
    }
}
