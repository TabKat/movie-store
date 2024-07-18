package com.lv.moviestore.services;

import com.lv.moviestore.models.DistinctDemo;
import com.lv.moviestore.repository.DistinctDemoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DistinctDemoService {
    DistinctDemoRepository distinctDemoRepository;

    @Autowired
    public DistinctDemoService(DistinctDemoRepository distinctDemoRepository) {
        this.distinctDemoRepository = distinctDemoRepository;
    }

    /**
     * Get all distinct
     *
     * @return the list of distinct
     */
    public List<DistinctDemo> getDistinct() {
        log.info("find all distinct");
        return distinctDemoRepository.findAll();
    }
}
