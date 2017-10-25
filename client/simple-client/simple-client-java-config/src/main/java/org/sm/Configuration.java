package org.sm;

import com.gemstone.gemfire.cache.client.Pool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.data.gemfire.client.ClientCacheFactoryBean;
import org.springframework.data.gemfire.support.ConnectionEndpoint;

import java.util.Properties;

/**
 * Created by smanvi on 7/21/17.
 */
public class Configuration {



//    @Bean
//    public PoolFactoryBean pool(){
//        PoolFactoryBean poolFactoryBean = new PoolFactoryBean();
//        poolFactoryBean.addLocators(new ConnectionEndpoint("localhost", 10334));
//        return poolFactoryBean;
//    }
}
