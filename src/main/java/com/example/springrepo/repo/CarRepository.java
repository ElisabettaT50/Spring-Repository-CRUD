package com.example.springrepo.repo;

import com.example.springrepo.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
