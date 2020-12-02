package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @Column(name = "car_model")
   private String model;

   @Column(name = "car_series")
   private int series;
   @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "car")
   private User user;

   public Car() {
   }

   public Car(String model, int series) {
      this.model = model;
      this.series = series;
   }


   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getSeries() {
      return series;
   }

   public void setSeries(int series) {
      this.series = series;
   }

   @Override
   public String toString() {
      return "Car{" +
              "id=" + id +
              ", model='" + model + '\'' +
              ", series=" + series +
              '}';
   }
}

