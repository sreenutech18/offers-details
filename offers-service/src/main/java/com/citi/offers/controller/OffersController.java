package com.citi.offers.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.offers.beans.Offer;
import com.citi.offers.beans.OffersRequest;
import com.citi.offers.beans.OffersResponse;

@RestController
@RequestMapping(value = "/v1")
public class OffersController {

	@RequestMapping(value = "/offer/{pid}", method =RequestMethod.GET , produces = "application/json")
	@ResponseBody
	public OffersResponse getOffers(@PathVariable("pid") String productId) {

		OffersResponse response = new OffersResponse();

		List<Offer> offers = new ArrayList<Offer>();

		Offer offer = new Offer();
		offer.setOid("1234");
		offer.setName("Thanks giving day");
		offer.setDesc("upto 70% offers discount");
		offer.setDiscount(30);
		offer.setPid("1234");
		offer.setPname("iphone 13");

		offers.add(offer);

		response.setOffers(offers);

		return response;
	}

	@RequestMapping(value = "/offer", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public OffersResponse getOffers(@RequestBody OffersRequest request) {

		OffersResponse response = new OffersResponse();

		List<Offer> offers = new ArrayList<Offer>();

		for (int i = 0; i < 10; i++) {
			Offer offer = new Offer();
			offer.setOid("1234");
			offer.setName("Thanks giving day");
			offer.setDesc("upto 70% offers discount");
			offer.setDiscount(30);
			offer.setPid("1234");
			offer.setPname("iphone 13");

			offers.add(offer);

		}

		response.setOffers(offers);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

}
