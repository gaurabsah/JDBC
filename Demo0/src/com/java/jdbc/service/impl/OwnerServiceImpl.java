package com.java.jdbc.service.impl;

import java.util.List;
import java.util.Optional;

import com.java.jdbc.dto.OwnerDTO;
import com.java.jdbc.exceptions.DuplicateOwnerException;
import com.java.jdbc.exceptions.OwnerNotFoundException;
import com.java.jdbc.repository.OwnerRepository;
import com.java.jdbc.repository.impl.OwnerRepositoryImpl;
import com.java.jdbc.service.OwnerService;

/**
 * @author Gaurab Sah
 *
 */

public class OwnerServiceImpl implements OwnerService {
	
	private OwnerRepository ownerRepository;
	
	private static final String OWNER_ALREADY_EXISTS = "Owner already exists with ownerId ";
	private static final String OWNER_NOT_FOUND = "Can't find owner with ownerId ";

	public OwnerServiceImpl() {
		this.ownerRepository = new OwnerRepositoryImpl();
	}

	@Override
	public void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException {
		Optional<OwnerDTO> existingOwnerDTO = ownerRepository.findOwner(ownerDTO.getId());
		if (existingOwnerDTO.isPresent()) {
			throw new DuplicateOwnerException(OWNER_ALREADY_EXISTS + ownerDTO.getId());
		} else {
			ownerRepository.saveOwner(ownerDTO);
		}
	}

	@Override
	public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException {
		Optional<OwnerDTO> ownerDTO = ownerRepository.findOwner(ownerId);
		if (ownerDTO.isEmpty()) {
			throw new OwnerNotFoundException(OWNER_NOT_FOUND + ownerId);
		} else {
			return ownerDTO.get();
		}
	}

	@Override
	public void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException {
		Optional<OwnerDTO> ownerDTO = ownerRepository.findOwner(ownerId);
		if (ownerDTO.isEmpty()) {
			throw new OwnerNotFoundException(OWNER_NOT_FOUND + ownerId);
		} else {
			ownerRepository.updatePetDetails(ownerId, petName);
		}
	}

	@Override
	public void deleteOwner(int ownerId) throws OwnerNotFoundException {
		Optional<OwnerDTO> ownerDTO = ownerRepository.findOwner(ownerId);
		if (ownerDTO.isEmpty()) {
			throw new OwnerNotFoundException(OWNER_NOT_FOUND + ownerId);
		} else {
			ownerRepository.deleteOwner(ownerId);
		}
	}

	@Override
	public List<OwnerDTO> findAllOwners() {
		return ownerRepository.findAllOwners();
	}
}