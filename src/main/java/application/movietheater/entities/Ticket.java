package application.movietheater.entities;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "paid_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paidTime;

    @Column(name = "price")
    private Double price;

    @OneToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "invoice_id")
    @ToString.Exclude
    private Invoice invoice;
}
