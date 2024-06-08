package com.java.jdbc.repository;

import java.util.List;

import com.java.jdbc.dto.OwnerDTO;

/**
 * @author Gaurab Sah
 *
 */

public interface OwnerRepository {

	void saveOwnersAutomatically(List<OwnerDTO> owners);

	void saveOwnersManually(List<OwnerDTO> owners);

	void saveOwnersManuallyWithSavepoint(List<OwnerDTO> owners);
}