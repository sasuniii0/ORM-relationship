package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
/*
@Data
*/

@Getter
@Setter
@Table(name = "customer")

//inverse side

public class Customer {
    @Id
    @Column(name = "customerId")
    private String id;
    private String name;
    private String nic;
    private String email;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Order> orders;

/*
    inverse side eke relationship danne natuw apita puluwn table hadanna.
    eth apita ba orders ekta customer eka hadaddi save krnna
*/
}
