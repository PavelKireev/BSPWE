package cz.upce.bspwe.db.entity;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Entity
@ToString
@RequiredArgsConstructor
public class Patient extends User {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Patient patient = (Patient) o;
        return id != null && Objects.equals(id, patient.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
