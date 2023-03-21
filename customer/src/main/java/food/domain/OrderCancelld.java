package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelld extends AbstractEvent {

    private Long id;

    public OrderCancelld(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelld() {
        super();
    }
}
