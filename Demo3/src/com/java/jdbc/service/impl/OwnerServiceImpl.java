package com.java.jdbc.service.impl;

import java.util.List;

import com.java.jdbc.dto.OwnerDTO;
import com.java.jdbc.enums.PetType;
import com.java.jdbc.repository.OwnerRepository;
import com.java.jdbc.repository.impl.OwnerRepositoryImpl;
import com.java.jdbc.service.OwnerService;

/**
 * @author Gaurab Sah
 *
 */

public class OwnerServiceImpl implements OwnerService {
	private OwnerRepository ownerRepository;

	public OwnerServiceImpl() {
		this.ownerRepository = new OwnerRepositoryImpl();
	}

	@Override
	public List<OwnerDTO> findOwners(PetType petType) {
		return ownerRepository.findOwners(petType.toString());
	}

	@Override
	public List<OwnerDTO> updatePetDetails(PetType petType, boolean useCallable) {
		if (useCallable) {
			return ownerRepository.updatePetDetailsWithCallable(petType.toString());
		} else {
			return ownerRepository.updatePetDetailsWithoutCallable(petType.toString());
		}
	}

}