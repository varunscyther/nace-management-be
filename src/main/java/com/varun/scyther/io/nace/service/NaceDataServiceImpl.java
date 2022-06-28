package com.varun.scyther.io.nace.service;

import com.varun.scyther.io.nace.exception.NaceDetailsNotFoundException;
import com.varun.scyther.io.nace.model.NaceDetails;
import com.varun.scyther.io.nace.repository.NaceDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class NaceDataServiceImpl implements NaceDataService{

    private final NaceDetailsRepository repository;

    public NaceDataServiceImpl(NaceDetailsRepository repository) {
        this.repository = repository;
    }

    /**
     * @param data
     * @return
     */
    @Override
    public NaceDetails putNaceDetails(NaceDetails data) {
        return repository.save(data);
    }

    /**
     * @param orderId
     * @return
     */
    @Override
    public NaceDetails getNaceDetails(Long orderId) {
        return repository.findByOrderNo(orderId)
                .orElseThrow(() -> new NaceDetailsNotFoundException(orderId));
    }
}
