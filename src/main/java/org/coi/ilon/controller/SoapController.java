package org.coi.ilon.controller;

import org.coi.ilon.client.SoapClient;
import org.coi.ilon.proxyclasses.EXSelect;
import org.coi.ilon.proxyclasses.List;
import org.coi.ilon.proxyclasses.ListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {

    @Autowired
    private SoapClient client;

    @PostMapping("/list")
    public ListResponse invokeList(@RequestBody EXSelect request){
        return client.getList(request);
    }

}
