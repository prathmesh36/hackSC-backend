package org.hacksc.repository;


import org.hacksc.model.db.Shelter;
import org.hacksc.model.db.Transport;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransportRepository extends CrudRepository<Transport, Integer> {

    @Query(value = "SELECT * FROM TRANSPORT", nativeQuery = true)
    List<Transport> findAllTransport();

    @Query(value = "SELECT * FROM TRANSPORT u WHERE u.ZIPCODE = :zip", nativeQuery = true)
    List<Transport> findTransportByZip(@Param("zip") String zip);

}
