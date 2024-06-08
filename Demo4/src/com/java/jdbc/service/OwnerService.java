package com.java.jdbc.service;

import java.util.List;

import com.java.jdbc.dto.OwnerDTO;

/**
 * @author Gaurab Sah
 *
 */

public interface OwnerService {

	void saveOwnersAutomatically(List<OwnerDTO> ownerDTOs);

	void saveOwnersManually(List<OwnerDTO> ownerDTOs);

	void saveOwnersManuallyWithSavepoint(List<OwnerDTO> ownerDTOs);
}