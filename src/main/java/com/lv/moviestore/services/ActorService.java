package com.lv.moviestore.services;

import com.lv.moviestore.models.Actor;
import com.lv.moviestore.repository.ActorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ActorService {
    ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getActors() {
        return actorRepository.findAll();
    }
}
