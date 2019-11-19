package com.sirenka.datamanager.datatest;

import com.sirenka.datamanager.controller.NewOfferController;
import com.sirenka.datamanager.model.Offer;
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
        when(offerService.saveOffer(of)).thenReturn(true);
        assert(newOfferController.saveSubmittedOffer(of).getContent().equals("Succesfully completed request"));
    }

    @Test
    public void FailedNewOffer() {
        Offer of = new Offer();
        when(offerService.saveOffer(of)).thenReturn(false);
        assert(newOfferController.saveSubmittedOffer(of).getContent().equals("Failed to execute request"));
    }

    @Test
    public void ewOffers() {
        List<Offer> of = Arrays.asList(new Offer());
        when(offerService.saveOffers(of)).thenReturn(true);
        assert(newOfferController.saveSubmittedOffer(of).getContent().equals("Succesfully completed request"));
    }

    @Test
    public void failedNewOffer() {
        Offer of = new Offer();
        when(offerService.saveOffer(of)).thenReturn(false);
        assert(newOfferController.saveSubmittedOffer(of).getContent().equals("Failed to execute request"));
    }
}
