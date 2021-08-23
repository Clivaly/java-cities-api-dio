package com.github.clivalycardoso.staties.repositories;

import com.github.clivalycardoso.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
