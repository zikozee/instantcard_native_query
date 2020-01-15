package com.heritage.instantcard.controller;

import com.heritage.instantcard.model.InstantCard;
import com.heritage.instantcard.service.InstantCardService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstantCardController {

    private final InstantCardService cardService;

    public InstantCardController(InstantCardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping(value={"/instantCard/JSON/{orgKey}", "/JSON/{orgKey}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public InstantCard getJSONInstantCard(@PathVariable String orgKey){
        return cardService.getSingleEntity(orgKey);
    }

    @GetMapping(value = {"/instantCard/XML/{orgKey}", "/XML/{orgKey}"}, produces = MediaType.APPLICATION_XML_VALUE)
    public InstantCard getXMLInstantCard(@PathVariable String orgKey){
        return cardService.getSingleEntity(orgKey);
    }
}
