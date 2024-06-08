package com.java.jdbc.service;

import java.time.LocalDate;
import java.util.List;

import com.java.jdbc.dto.OwnerDTO;
import com.java.jdbc.exceptions.DuplicateOwnerException;
import com.java.jdbc.exceptions.OwnerNotFoundException;

/**
 * @author Gaurab Sah
 *
 */

public interface OwnerService {
	
	void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException;

	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException;

	void deleteOwner(int ownerId) throws OwnerNotFoundException;

	List<OwnerDTO> findAllOwners();
	
	List<OwnerDTO> findOwner(String ownerEmailId, LocalDate petBirthDate);
}