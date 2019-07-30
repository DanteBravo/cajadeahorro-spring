package com.cajadeahorro.admin.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "credits")
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "interest_rate")
    private BigDecimal interestRate;
    @ManyToOne(
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "user_clave",
            nullable = false
    )
    private User clave;
    @ManyToOne(
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "group_id",
            nullable = false
    )
    private Group group;
    @Column(name = "start_date")
    private Timestamp startDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public User getClave() {
        return clave;
    }

    public void setClave(User clave) {
        this.clave = clave;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
