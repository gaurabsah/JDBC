package com.java.jdbc.service;

import java.util.List;

import com.java.jdbc.dto.OwnerDTO;
import com.java.jdbc.enums.PetType;

/**
 * @author Gaurab Sah
 *
 */

public interface OwnerService {
	
	List<OwnerDTO> findOwners(PetType petType);

	List<OwnerDTO> updatePetDetails(PetType petType, boolean useCallable);
}