package com.lv.moviestore.repository;

import com.lv.moviestore.models.DistinctDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistinctDemoRepository extends JpaRepository<DistinctDemo, Long> {
}
