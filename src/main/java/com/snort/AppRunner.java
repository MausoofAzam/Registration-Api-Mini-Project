package com.snort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.snort.entity.EligibilityDetails;
import com.snort.repository.EligibilityDetailsRepo;

public class AppRunner implements ApplicationRunner{

	@Autowired
	private EligibilityDetailsRepo detailsRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		EligibilityDetails entity1 = new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("Azam");
		entity1.setEmail("azam@gmail.com");
//		entity1.setMobile(5454564);
		entity1.setGender('M');
//		entity1.setSsn(5545544554);
		entity1.setPlanName("SMAW");
		entity1.setPlanStatus("Approved");
	}

}
