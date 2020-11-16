package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message="Location required.")
    @Size(min=3, max=100, message="Location must be between 3 and 100 characters long.")
    private String location;

    public Employer() {
    }

    public Employer(@NotNull(message = "Location required.") @Size(min = 3, max = 100, message = "Location must be between 3 and 100 characters long.") String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
