package andrei.chirila.prove_yourself.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID userId;
    @Column(name = "provider")
    private String provider;
    @Column(name = "provider_id", unique = true)
    private String providerId;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "name")
    private String name;
}
