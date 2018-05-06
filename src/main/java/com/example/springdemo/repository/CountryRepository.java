package com.example.springdemo.repository;

import com.example.springdemo.domain.CountryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<CountryEntity, Long>{

    List<CountryEntity> findAllByOrderByIdAsc();
}
