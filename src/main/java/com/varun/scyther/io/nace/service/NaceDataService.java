package com.varun.scyther.io.nace.service;

import com.varun.scyther.io.nace.model.NaceDetails;

public interface NaceDataService {
    public NaceDetails putNaceDetails(NaceDetails data);
    public NaceDetails getNaceDetails(Long orderId);
}
