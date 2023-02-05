package org.hacksc.model.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Transport {
    @Id
    private String transportid;

    private String name;

    private String street;

    private String isactive;

    private String sourcelongitude;

    private String sourcelatitude;

    private String destlattitude;

    private String destlongitude;

    private String zipcode;

    private String timearrival;
}
