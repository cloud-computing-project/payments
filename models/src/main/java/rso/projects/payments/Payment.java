package rso.projects.payments;
import org.eclipse.persistence.annotations.UuidGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "payments")
@NamedQueries(value =
        {
                @NamedQuery(name = "Payments.getAll", query = "SELECT p FROM payments p")
        })
@UuidGenerator(name = "idGenerator")
public class Payment {

        @Id
        @GeneratedValue(generator = "idGenerator")
        private String id;

        @Column(name = "order_id")
        private String orderId;

        private String method;

        @Column(name = "immediate_payment")
        private String immediatePayment;

        private String instructions;

        @Transient
        private List<Order> orders;

        public String getImmediatePayment() {
                return immediatePayment;
        }

        public void setImmediatePayment(String immediatePayment) {
                this.immediatePayment = immediatePayment;
        }

        public String getInstructions() {
                return instructions;
        }

        public void setInstructions(String instructions) {
                this.instructions = instructions;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getOrderId() {
                return orderId;
        }

        public void setOrderId(String orderId) {
                this.orderId = orderId;
        }

        public String getMethod() {
                return method;
        }

        public void setMethod(String method) {
                this.method = method;
        }

        public List<Order> getOrders() {
                return orders;
        }

        public void setOrders(List<Order> orders) {
                this.orders = orders;
        }
}
