package com.snort.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.snort.entity.EligibilityTest;

@Service

public interface EligibilityDetailsRepo extends JpaRepository<EligibilityTest, Integer> {

}
