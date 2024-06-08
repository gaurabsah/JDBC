package com.java.jdbc.service.impl;

import java.util.List;

import com.java.jdbc.dto.OwnerDTO;
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
	public void saveOwnersAutomatically(List<OwnerDTO> ownerDTOs) {
		ownerRepository.saveOwnersAutomatically(ownerDTOs);
	}

	@Override
	public void saveOwnersManually(List<OwnerDTO> ownerDTOs) {
		ownerRepository.saveOwnersManually(ownerDTOs);
	}

	@Override
	public void saveOwnersManuallyWithSavepoint(List<OwnerDTO> ownerDTOs) {
		ownerRepository.saveOwnersManuallyWithSavepoint(ownerDTOs);
	}
}