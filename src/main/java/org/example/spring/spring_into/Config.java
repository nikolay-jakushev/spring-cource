package org.example.spring.spring_into;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:app.properties")
@EnableAspectJAutoProxy
public class Config {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
