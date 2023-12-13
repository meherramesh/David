package com.parent.service;

	import java.util.List;
	import java.util.Optional;

import com.parent.model.EntityModel;


	public interface EntityService {

	 List<EntityModel> getAllEntities();

	 Optional<EntityModel> getEntityById(Long id);

	 EntityModel createEntity(EntityModel entity);

	 EntityModel updateEntity(Long id, EntityModel updatedEntity);

	 void deleteEntity(Long id);
	}
