package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
/*
@Data
*/

@Getter
@Setter
@Table(name = "orders")

//Owning side

public class Order {
    @Id
    @Column(name = "orderId")
    private String id;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList;
}
