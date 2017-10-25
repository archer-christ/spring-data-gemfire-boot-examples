package simple.client;

import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.client.ClientCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import sdg.examples.common.Customer;


/**
 * Created by smanvi on 7/20/17.
 */
@SpringBootApplication
@ImportResource("classpath:client-cache.xml")
public class Launcher {

    public static void main(String args[]) {
        SpringApplication.run(Launcher.class, args);
    }

    @Bean
    public String putData(@Qualifier("Customer") Region customerRegion) {
        Customer c = new Customer("aa", "bbb", "ccc");
        customerRegion.put(11, c);
        return "done";
    }

    @Bean
    public String getData(@Qualifier("Customer") Region customerRegion) {
        Customer customer = (Customer) customerRegion.get("1");
        System.out.println(" Customer Details : " + customer.toString());
        return customer.toString();
    }

}
