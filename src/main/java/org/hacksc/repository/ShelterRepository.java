package org.hacksc.repository;


import org.hacksc.model.db.Shelter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShelterRepository extends CrudRepository<Shelter, Integer> {

    @Query(value = "SELECT * FROM SHELTER", nativeQuery = true)
    List<Shelter> findAllShelter();

    @Query(value = "SELECT * FROM SHELTER u WHERE u.ZIPCODE = :zip", nativeQuery = true)
    List<Shelter> findShelterByZip(@Param("zip") String zip);

}
