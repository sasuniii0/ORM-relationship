package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.image.ImageProducer;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "itemId")
    private String id;

    @Column(length = 100)
    private String name;
    private String quantity;

    @Column(scale = 2,name = "unit_price",precision = 10)
    private BigDecimal unitPrice;

    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetailList;
}
