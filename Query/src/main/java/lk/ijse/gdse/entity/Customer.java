package lk.ijse.gdse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    private int id;
    @Column(name = "customer_name")
    private String name;
    private String email;
}
