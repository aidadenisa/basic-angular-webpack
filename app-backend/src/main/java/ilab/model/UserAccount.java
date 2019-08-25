package ilab.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="u_id")
    private long id;

    @Column(name="u_hash", unique = true)
    private String hash;

    @Column(name="u_email", unique = true)
    private String email;

    public long getId() {
        return id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
