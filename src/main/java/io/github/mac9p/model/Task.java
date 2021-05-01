package io.github.mac9p.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tasks")
class Task {
    @Id
    private int id;
    private String description;
    private boolean done;
}
