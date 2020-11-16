package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min=3, max=300, message = "Skill descriptions must be between 3 and 300 characters.")
    private String description;

    public Skill() {
    }

    public Skill(@Size(min = 3, max = 300, message = "Skill descriptions must be between 3 and 300 characters.") String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}