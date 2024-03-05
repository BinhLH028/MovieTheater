package application.movietheater.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@EqualsAndHashCode(exclude = "appUser")
@Table(name = "employees")
public class Employee extends AppUser {

    @OneToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private AppUser appUser;
}
