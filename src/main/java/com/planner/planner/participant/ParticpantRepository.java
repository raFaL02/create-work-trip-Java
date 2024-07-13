package com.planner.planner.participant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticpantRepository extends JpaRepository<Participant, UUID> {
}
