package nl.nynkek.menstruatiedisk.dtos;

import nl.nynkek.menstruatiedisk.models.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PendingDiscDto {
    private Long id;
    private String createdDate;
    private User user;
}
