package application.movietheater.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@EqualsAndHashCode(exclude = "appUser")
@Table(name = "members")
public class Member extends AppUser{

    @OneToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private AppUser appUser;


}
