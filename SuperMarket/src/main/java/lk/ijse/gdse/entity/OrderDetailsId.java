package lk.ijse.gdse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderDetailsId {
   // @Column(name = "order_id")
    private String OrderId;

   // @Column(name = "item_id")
    private String itemId;

}
