package com.customer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages= {"com.customer"})
@ImportResource("classpath:springDemo-data-context.xml")
public class ServiceContextConfig {

}
