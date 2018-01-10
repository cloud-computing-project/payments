package rso.projects.payments;
import org.eclipse.persistence.annotations.UuidGenerator;

import javax.persistence.*;

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

        @Column(name = "product_id")
        private String productId;

        @Column(name = "sales_id")
        private String salesId;

        private String method;

        @Column(name = "immediate_payment")
        private String immediatePayment;

        private String instructions;

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

        public String getProductId() {
                return productId;
        }

        public void setProductId(String productId) {
                this.productId = productId;
        }

        public String getSalesId() {
                return salesId;
        }

        public void setSalesId(String salesId) {
                this.salesId = salesId;
        }

        public String getMethod() {
                return method;
        }

        public void setMethod(String method) {
                this.method = method;
        }
}
