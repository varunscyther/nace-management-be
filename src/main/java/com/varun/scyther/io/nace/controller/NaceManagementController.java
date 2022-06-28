package com.varun.scyther.io.nace.controller;

import com.varun.scyther.io.nace.model.NaceDetails;
import com.varun.scyther.io.nace.service.NaceDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nace/api")
public class NaceManagementController {

    @Autowired
    private NaceDataServiceImpl service;

    @PostMapping("/nacedetails")
    NaceDetails putNaceDetails(@RequestBody NaceDetails data) {
        return service.putNaceDetails(data);
    }

    @GetMapping("/nacedetails/{orderId}")
    NaceDetails getNaceDetails(@PathVariable Long orderId) {
        return service.getNaceDetails(orderId);
    }
}
