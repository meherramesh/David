package com.parent.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.parent.model.EntityModel;
import com.parent.repo.EntityRepository;

import java.util.List;
	import java.util.Optional;

	@Service
	//Akshay Ramesh
	public class EntityServiceImpl implements EntityService {

	 @Autowired
	 private EntityRepository entityRepository;

	 @Override
	 public List<EntityModel> getAllEntities() {
	     return entityRepository.findAll();
	 }

	 @Override
	 public Optional<EntityModel> getEntityById(Long id) {
	     return entityRepository.findById(id);
	 }

	 @Override
	 public EntityModel createEntity(EntityModel entity) {
	     return entityRepository.save(entity);
	 }

	 @Override
	 public EntityModel updateEntity(Long id, EntityModel updatedEntity) {
	     updatedEntity.setId(id);
	     return entityRepository.save(updatedEntity);
	 }

	 @Override
	 public void deleteEntity(Long id) {
	     entityRepository.deleteById(id);
	 }

	}

