import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Car car(){
        return new Car("BMW","A",2.3);
    }
    @Bean
    Bus bus(){
        return new Bus("Mercedes","B", 3);
    }
    @Bean
    Pickup pickup(){
        return new Pickup("Dodge","WC",5);
    }

    @Bean
    Driver driverCar(){
        return new Driver("Олег",car());
    }
    @Bean
    Driver driverBus(){
        return new Driver("Вася",bus());
    }
    @Bean
    Driver driverPickup(){
        return new Driver("Иван",pickup());
    }
}
