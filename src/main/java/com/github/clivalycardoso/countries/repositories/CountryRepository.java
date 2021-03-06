package com.github.clivalycardoso.countries.repositories;

import com.github.clivalycardoso.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
