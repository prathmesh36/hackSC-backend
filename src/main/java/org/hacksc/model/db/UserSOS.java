package org.hacksc.model.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserSOS {
    @Id
    private String uid;

    private String sourcelongitude;

    private String sourcelatitude;

    private String message;
}
