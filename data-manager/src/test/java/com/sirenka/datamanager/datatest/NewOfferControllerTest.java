package com.sirenka.datamanager.datatest;

import com.sirenka.datamanager.controller.NewOfferController;
import com.sirenka.datamanager.model.Offer;
import com.sirenka.datamanager.service.OfferException;
import com.sirenka.datamanager.service.OfferService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class NewOfferControllerTest {

    @InjectMocks
    private NewOfferController newOfferController;
    @Mock
    private OfferService offerService;
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void newOffer() {
        Offer of = new Offer();
        try {
            doNothing().when(offerService).saveOffer(of);
        } catch (OfferException ex){

        }
        assert(newOfferController.saveSubmittedOffer(of).getContent().equals("Succesfully added offers to data base!"));
    }

    @Test
    public void FailedNewOffer() {
        Offer of = new Offer();
        try {
            doThrow(new OfferException("test")).when(offerService).saveOffer(of);
        } catch (OfferException ex) {

        }
        assert(!newOfferController.saveSubmittedOffer(of).getContent().equals("Failed to execute request"));
    }

    @Test
    public void newOffers() {
        List<Offer> of = Arrays.asList(new Offer());
        try {
            doNothing().when(offerService).saveOffers(of);;
        } catch (OfferException ex) {

        }
        assert(newOfferController.saveSubmittedOffers(of).getContent().equals("Succesfully added offers to data base!"));
    }

    @Test
    public void failedNewOffer() {
        List<Offer> of = Arrays.asList(new Offer());
        try {
            doThrow(new OfferException("test")).when(offerService).saveOffers(of);
        }catch (OfferException ex) {

        }
        assert(!newOfferController.saveSubmittedOffers(of).getContent().equals("Failed to execute request"));
    }
}
