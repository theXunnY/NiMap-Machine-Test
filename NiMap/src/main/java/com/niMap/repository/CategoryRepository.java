package com.niMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niMap.entity.Category;

import jakarta.persistence.NamedQueries;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
