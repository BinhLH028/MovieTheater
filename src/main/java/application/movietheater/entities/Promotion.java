package application.movietheater.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "promotions")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "detail")
    private String detail;

    @Column(name = "discount_level")
    private Integer discountLevel;

    @Column(name = "title")
    private String title;

    @Column(name = "start_time")
    @Temporal(TemporalType.DATE)
    private Date startTime;

    @Column(name = "end_time")
    @Temporal(TemporalType.DATE)
    private Date endTime;

    @Column(name = "image")
    private String image;
}
