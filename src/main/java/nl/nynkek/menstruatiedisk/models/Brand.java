package nl.nynkek.menstruatiedisk.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Brand {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String website;
    private String description;
}
