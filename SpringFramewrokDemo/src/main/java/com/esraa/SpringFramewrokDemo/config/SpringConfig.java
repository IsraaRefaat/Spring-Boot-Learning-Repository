package com.esraa.SpringFramewrokDemo.config;

import com.esraa.SpringFramewrokDemo.Alien;
import com.esraa.SpringFramewrokDemo.Computer;
import com.esraa.SpringFramewrokDemo.Desktop;
import com.esraa.SpringFramewrokDemo.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfig {

    @Bean
    public Alien alien(Computer com){
        Alien alien = new Alien();
        alien.setCom(com);
        return alien;
    }


    @Bean
    public Laptop laptop() {
        return new Laptop();
    }

    @Bean
    @Primary
    public Desktop desktop() {
        return new Desktop();
    }

}
