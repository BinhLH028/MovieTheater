package application.movietheater.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@EqualsAndHashCode(exclude = "account")
@Table(name = "members")
public class Member extends Account{

    @OneToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "account_id")
    @ToString.Exclude
    private Account account;


}
