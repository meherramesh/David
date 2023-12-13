package com.parent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parent.model.EntityModel;

public interface EntityRepository extends JpaRepository<EntityModel, Long> {
}
