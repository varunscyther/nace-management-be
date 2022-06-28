package com.varun.scyther.io.nace.repository;

import com.varun.scyther.io.nace.model.NaceDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NaceDetailsRepository extends JpaRepository<NaceDetails, Long> {
    Optional<NaceDetails> findByOrderNo(Long orderNo);

}
