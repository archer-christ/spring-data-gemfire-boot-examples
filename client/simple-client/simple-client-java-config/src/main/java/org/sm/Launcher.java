package org.sm;

import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.client.ClientCache;
import com.gemstone.gemfire.cache.client.Pool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.gemfire.client.ClientCacheFactoryBean;
import org.springframework.data.gemfire.support.ConnectionEndpoint;
import sdg.examples.common.Customer;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * Created by smanvi on 7/21/17.
 */
@SpringBootApplication
public class Launcher {

    public static void main(String args[]) {
        SpringApplication.run(Launcher.class, args);
    }

    @Bean
//    @DependsOn("clientCache")
    public String runTest(@Autowired ClientCache clientCache){
        System.out.println("Running test");
        Region<Integer, String> testRegion = clientCache.getRegion("TestRegion");
        testRegion.put(1, "AA");
        return "Success";
    }

//    private void runTest(@Autowired ClientCache clientCache) {
//        System.out.println("Running test");
//        Region<Integer, String> testRegion = clientCache.getRegion("TestRegion");
//        testRegion.put(1, "AA");
//    }

//    @Bean
//    public Properties gemFireProperties() {
//        Properties properties = new Properties();
//        properties.setProperty("locators", "localhost[10334]");
//        return properties;
//    }
//
//    @Bean
//    public ClientCacheFactoryBean clientCache() {
//        ClientCacheFactoryBean clientCacheFactoryBean = new ClientCacheFactoryBean();
//        clientCacheFactoryBean.addLocators(new ConnectionEndpoint("localhost", 10334));
//        clientCacheFactoryBean.getDynamicRegionSupport();
//
//        return clientCacheFactoryBean;
//    }

//    @Bean
//    public String getData(ClientCache clientCache) {
//        Region<Object, Customer> customerRegion = clientCache.getRegion("Customer");
//        Customer customer = customerRegion.get("1");
//        System.out.println(" Customer Details : " + customer.toString());
//        return customer.toString();
//    }
}
