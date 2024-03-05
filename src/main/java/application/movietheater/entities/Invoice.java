package application.movietheater.entities;

import application.movietheater.enums.InvoiceStatus;
import jakarta.persistence.*;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "invoices")
@Inheritance(strategy = InheritanceType.JOINED)
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "use_score")
    private Integer useScore;

    @Column(name = "booking_date")
    private LocalDate bookingDate;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "status")
    private InvoiceStatus status;

    @OneToMany(mappedBy = "invoice")
    private List<ScheduleSeat> scheduleSeats;

    @OneToOne(mappedBy = "invoice", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser appUser;
}
