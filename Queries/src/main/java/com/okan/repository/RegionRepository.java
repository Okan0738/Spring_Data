package com.okan.repository;

import com.okan.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    // display all regions in Canada

    List<Region> findByCountry(String country);

    List<Region> getByCountry(String country);

    List<Region> findByCountryOrderByRegion(String country);

    List<Region> findTopByCountry(String country);

    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainingOrderByRegion(String country);


}
