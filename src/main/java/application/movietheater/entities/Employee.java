package application.movietheater.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@EqualsAndHashCode(exclude = "account")
@Table(name = "employees")
public class Employee extends fa.training.model.Account {
    @OneToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "account_id")
    @ToString.Exclude
    private fa.training.model.Account account;
}
