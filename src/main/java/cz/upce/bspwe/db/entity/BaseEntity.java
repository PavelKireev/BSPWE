package cz.upce.bspwe.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Getter
    @Setter
    protected String uuid;

    @Getter
    @Setter
    private LocalDateTime createdAt = LocalDateTime.now();

    @Getter
    @Setter
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
        setUuid(generateUUID());
    }

    @PreUpdate
    public void onPreUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }

    private String generateUUID(){
        return UUID.randomUUID().toString();
    }
}
