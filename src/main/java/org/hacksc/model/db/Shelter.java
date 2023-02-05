package org.hacksc.model.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Shelter {
    @Id
    private String shelterid;

    private String isprivate;

    private String locationlongitude;

    private String locationlatitude;

    private String street;

    private String zipcode;

    private String vacancy;

    private String type;
}
