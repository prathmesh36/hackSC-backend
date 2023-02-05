package org.hacksc.repository;


import org.hacksc.model.db.Shelter;
import org.hacksc.model.db.UserSOS;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserSOSRepository extends CrudRepository<UserSOS, Integer> {

    @Query(value = "SELECT * FROM USERSOS", nativeQuery = true)
    List<UserSOS> findAllUser();


}
