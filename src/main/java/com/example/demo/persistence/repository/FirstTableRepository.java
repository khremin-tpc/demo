package com.example.demo.persistence.repository;

import com.example.demo.persistence.entity.FirstTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirstTableRepository extends JpaRepository<FirstTable, Long> {
}
